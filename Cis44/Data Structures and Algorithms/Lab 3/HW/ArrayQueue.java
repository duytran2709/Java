package Queues;
public class ArrayQueue<T> implements QueueInterface<T>  {
    private T[] queue; // circular array of queue entries and one unused location
    private int frontIndex;
    private int backIndex;
    private static final int DEFAULT_INITIAL_CAPACITY = 50;
    
    public ArrayQueue() {
	this(DEFAULT_INITIAL_CAPACITY);
    } // end default constructor
    
    public ArrayQueue(int initialCapacity) {
	// the cast is safe because the new array contains null entries
	@SuppressWarnings("unchecked")
	    T[] tempQueue = (T[]) new Object[initialCapacity + 1];
	queue = tempQueue;
	frontIndex = 0;
	backIndex = initialCapacity;
    } // end constructor
    
    public void enqueue(T newEntry) {
	ensureCapacity();   
	backIndex = (backIndex + 1) % queue.length;
	queue[backIndex] = newEntry;
    } // end enqueue
    
    public T getFront(){
	T front = null;
	if (!isEmpty())
	    front = queue[frontIndex];
	
	return front;
    } // end getFront
    
    public T dequeue() {
	T front = null;
	if (!isEmpty())  {
	    front = queue[frontIndex];
	    queue[frontIndex] = null;
	    frontIndex = (frontIndex + 1) % queue.length;
	} // end if
	
	return front;
    } // end dequeue
    
    private void ensureCapacity() {
	if (frontIndex == ((backIndex + 2) % queue.length))  { // if array is full,
	    T[] oldQueue = queue;
	    int oldSize = oldQueue.length;
	    @SuppressWarnings("unchecked")
		T[] tempQueue = (T[]) new Object[2 * oldSize];
	    queue = tempQueue;
	    for (int index = 0; index < oldSize - 1; index++) {
		queue[index] = oldQueue[frontIndex];
		frontIndex = (frontIndex + 1) % oldSize;
	    } // end for
	    
	    frontIndex = 0;
	    backIndex = oldSize - 2;
	} // end if
    } // end ensureCapacity

    public boolean isEmpty() {
	return frontIndex == ((backIndex + 1) % queue.length);
    } // end isEmpty
    
    public void clear() {
	if(!isEmpty()) {
	    for (int index = frontIndex; index != backIndex; index = (index+1)%queue.length)
		queue[index] = null;
	    queue[backIndex] = null;
	}
	frontIndex = 0;
	backIndex = queue.length - 1;
    }
    
    public static boolean check(String s)
    {
    	//Create 2 queues for checking equal
    	QueueInterface <String> queue1 = new ArrayQueue<String>();
    	QueueInterface <String> queue2 = new ArrayQueue<String>();
    	
    	int length = s.length();
    	
    	String tempString = new String (s);
    	char tempChar;
    	
    	int bufferLength = 0;
    	
    	//Enqueue characters or numbers from string s to queue1
    	for (int i = 0; i < length; i++)
    	{
    		tempChar = tempString.charAt(i);
    		if (((tempChar >= 'a') && (tempChar <= 'z')) || ((tempChar >= 'A') && (tempChar <= 'Z')) || ((tempChar >= '0') && (tempChar <= '9')))
    		{
    			queue1.enqueue("" + tempChar);
    			bufferLength++;
    		}		
    	}
    	
    	//Checking the number of characters, if it is odd then return False
    	if (bufferLength % 2 == 1)
    	{
    		System.out.println("False");
			return false;
    	}
    	
    	//Dequeue items in queue1 and enqueue to queue2
    	for (int i = 0; i < (bufferLength +1)/2; i++)
    	{
    		queue2.enqueue(queue1.dequeue());
    	}
    	
    	
    	String buffer1Front = null;
    	String buffer2Front = null;
    	
    	//Checking equal items from queue1 and queue2
    	while (!queue1.isEmpty())
    	{
    		buffer1Front = queue1.dequeue();
    		buffer2Front = queue2.dequeue();
    		
    		//Return false if it is not equal 
    		if (!buffer1Front.equalsIgnoreCase(buffer2Front))
    			return false;
    	}
    	//Else return true
    	return true;
    }// End check
    
    public void splice(QueueInterface<T> anotherQueue)
    {
    	//Dequeue anotherQueue then Enqueue to queue
    	while (!anotherQueue.isEmpty())
    	{
    		enqueue(anotherQueue.dequeue());
    	}
    }// End splice
    
    public boolean enqueueNoDuplicate (T item)
    {
    	//Get the range of the queue
    	int range = backIndex + 1 - frontIndex;
    	if (range < 0) range = (range + queue.length) % queue.length;
    	
    	boolean check = true;
    	T tempItem = null;
    	
    	//Dequeue items and check equally
    	//Then re-enqueue
    	for (int index = 0; index < range; index++)
    	{
    		tempItem = dequeue();
    		if ((tempItem == item) && (check == true)) check = false;
    		enqueue(tempItem);
    	}
    	
    	//Enqueue after checking
    	if (check == true)
    	{
    		enqueue (item);
    		return true;
    	}
    	return false;
    }//End enqueueNoDuplicate
    
} // end ArrayQueue
