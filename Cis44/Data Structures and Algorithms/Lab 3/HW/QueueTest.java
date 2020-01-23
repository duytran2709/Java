package Queues;

import java.io.IOException;
import java.io.FileWriter;

public class QueueTest {
    public static void main(String[] args) {
	QueueInterface<String> myQueue = new ArrayQueue<String>();
	myQueue.enqueue("Jim");
	myQueue.enqueue("Jess");
	myQueue.enqueue("Jill");
	myQueue.enqueue("Jane");
	myQueue.enqueue("Joe");
	
	String front = myQueue.getFront(); // returns “Jim”
	System.out.println(front + " is at the front of the queue.");
	
	front = myQueue.dequeue(); // removes and returns “Jim”;
	System.out.println(front + " is removed from the queue.");
	
	myQueue.enqueue("Jerry"); 
	front = myQueue.getFront(); // returns “Jess”
	System.out.println(front + " is at the front of the queue.");
	
	front = myQueue.dequeue(); // removes and returns “Jess”;
	System.out.println(front + " is removed from the queue.");
	
	//Printing to file output.txt
	try
	{
		FileWriter output = new FileWriter ("output.txt");
		if (output!= null)
		{
			//Testing problem P1
			String stringCheckSplit = new String ("Boooohj././Booooh;[j");
			boolean check = ArrayQueue.check(stringCheckSplit);
			if (check) output.write("\nString " + '"' + stringCheckSplit + '"' + " can be splited!\n");
			else output.write("\nString" + '"' + stringCheckSplit + '"' + " can't be splited!\n");
			
			//Testing problem P2 Part 2
			String stringCheckDuplicate = new String ("Jail");
			if (myQueue.enqueueNoDuplicate(stringCheckDuplicate)) output.write("\n" + stringCheckDuplicate + " is added to the queue\n");
			else output.write("\n" + stringCheckDuplicate + " already have in the queue\n");
			
			
			//Testing problem P2 Part 1
			QueueInterface<String> anotherQueue = new ArrayQueue<String>();
			anotherQueue.enqueue("A");
			anotherQueue.enqueue("B");
			myQueue.splice(anotherQueue);
			output.write ("\nAll values in myQueue after splicing anotherQueue:\n");
			while (!myQueue.isEmpty())
			{
				output.write(myQueue.dequeue() + "\t");
			}
			
			output.close();
		}
		
	}
	catch (IOException ieo)
	{
		ieo.printStackTrace();
	}
    }
}
