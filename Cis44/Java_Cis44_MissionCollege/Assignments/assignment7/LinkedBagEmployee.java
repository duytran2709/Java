/**
 * LinkedBagEmployee
 */
public class LinkedBagEmployee < T extends Comparable<T>> implements BagInterface<T> 
{


    public int numberOfEntries;
    public Node firstNode;

    LinkedBagEmployee()
    {
        firstNode = null;
        numberOfEntries = 0;
    }

    public T getOldest()
    {
        Node current = firstNode; 
        T Oldest = null; 
        if( current != null)
        {
            Oldest = current.data;
            current = current.next;
        }
        while( current != null)
        {
            T currentEmployee = current.data;
            if (currentEmployee.compareTo(Oldest) < 0)
            {
                Oldest = currentEmployee;
            }
            current = current.next;
        }

        return Oldest;
    }

    private class Node {
        public T data;
        public Node next;

        Node (T dataportion)
        {
            this(dataportion, null);
        }

        Node(T dataportion, Node nextNode) {
            data = dataportion;
            next = nextNode;
        }
    }
    
    @Override
    public String toString()
    {
        String st = "";
        Node current = firstNode;
        while( current != null)
        {
            st += current.data + "\n";
            current = current.next;
        }
        return st;
    }


    

    @Override
    public void display() {

        Node current = firstNode;
        while ( current != null)
        {
            T item = current.data;
            System.out.println(item);
            current = current.next;
        }
        // TODO Auto-generated method stub

    }

    @Override
    public int getCurrentSize() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean add(T newEntry) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public T remove() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean remove(T anEntry) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub

    }

    @Override
    public int getFrequencyOf(T anEntry) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean contains(T anEntry) {
        // TODO Auto-generated method stub
        return false;
    }
}