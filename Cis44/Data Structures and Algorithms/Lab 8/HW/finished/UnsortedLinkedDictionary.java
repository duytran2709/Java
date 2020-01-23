import java.util.Iterator;
import java.util.NoSuchElementException;
import java.io.FileWriter;
import java.io.IOException;

public class UnsortedLinkedDictionary<K, V>  {
	private int numberOfEntries = 0;
	private Node first;
	private Node last;
	
	public UnsortedLinkedDictionary() {

	} // end default constructor
	
   public V add(K key, V value) {
	   Node lastNode = last;
	   Node newNode = new Node (key, value);
	   last = newNode;
	   if (lastNode == null)
	   {
		   first = newNode;
	   }
	   else
	   {
		   lastNode.next = newNode;
	   }
	   numberOfEntries++;
	   return value;
   
   } // end add

   public V remove(K key) {
	   if (key != null)
	   {
		   for (Node x = first; x!= null; x = x.next)
		   {
			   if (key.equals(x.next.key))
			   {
				   V value = x.next.value;
				   x.next = x.next.next;
				   numberOfEntries--;
				   return value;
			   }
		   }
	   }
	   throw new NoSuchElementException();
   	  
   } // end remove

   public V getValue(K key) {
	   if (key != null)
	   {
		   for (Node x = first; x!= null; x = x.next)
		   {
			   if (key.equals(x.key))
			   {
				   return x.value;
			   }
		   }
	   }
	   throw new NoSuchElementException();
   } // end getValue

	public boolean contains(K key) {
		if (key != null)
		{
			for (Node x = first; x!= null; x = x.next)
			{
				if (key.equals(x.key))
					return true;
			}
		}
		return false;
		
   } // end contains

   public boolean isEmpty() {
	   return numberOfEntries == 0;
      
   } // end isEmpty
	
   public int getSize() {
	   return numberOfEntries;
      
   } // end getSize

	public final void clear() {
		for (Node x = first; x != null;)
		{
			Node next = x.next;
			x = null;
			x = next;
		}
		first = null;
		last = null;
		numberOfEntries = 0;
	
	} // end clear

	public Iterator<K> getKeyIterator() {
		return new Iterator <K>()
		{
			private int nextIndex = 1;
			private Node current;
			public boolean hasNext()
			{
				return nextIndex <= numberOfEntries;
			}
			public K next()
			{
				if (hasNext())
				{
					if (nextIndex == 1)
					{
						current = first;
						nextIndex++;
					}
					else
					{
						current = current.next;
						nextIndex++;
					}
					return current.getKey();
				}
				else throw new NoSuchElementException();
			}
		};
	
	} // end getKeyIterator
	
	public Iterator<V> getValueIterator() {
		return new Iterator <V>()
		{
			private int nextIndex = 1;
			private Node current;
			public boolean hasNext()
			{
				return nextIndex <= numberOfEntries;
			}
			
			public V next()
			{
				if (hasNext())
				{
					if (nextIndex == 1)
					{
						current = first;
						nextIndex++;
					}
					else
					{
						current = current.next;
						nextIndex++;
					}
					return current.getValue();
				}
				else throw new NoSuchElementException();
			}
			
		};
		
	} // end getValueIterator

	private class Node {
		private K key;
		private V value;
		private Node next;

		private Node(K searchKey, V dataValue) {
			key = searchKey;
			value = dataValue;
			next = null;	
		} // end constructor
		
		private Node(K searchKey, V dataValue, Node nextNode) {
			key = searchKey;
			value = dataValue;
			next = nextNode;	
		} // end constructor
		
		private K getKey() {
			return key;
		} // end getKey
		
		private V getValue() {
			return value;
		} // end getValue

		private void setValue(V newValue) {
			value = newValue;
		} // end setValue

		private Node getNextNode()
		{
			return next;
		} // end getNextNode
		
		private void setNextNode(Node nextNode) {
			next = nextNode;
		} // end setNextNode
	} // end Node
	
	public static void main(String args[])
	{
		UnsortedLinkedDictionary <String, String> dictionary = new UnsortedLinkedDictionary <String, String>();
		Iterator <String> iteratorKey = dictionary.getKeyIterator();
		Iterator <String> iteratorValue = dictionary.getValueIterator();
		String key;
		String value;
		
		//Initial entries
		dictionary.add("a", "aaaa");
		dictionary.add("b", "bbbb");
		dictionary.add("c", "cccc");
		dictionary.add("d", "dddd");
		dictionary.add("e", "eeee");
		dictionary.add("f", "ffff");
		dictionary.add("g", "gggg");
		
		try
		{
			FileWriter output = new FileWriter ("output.txt");
			if (output != null)
			{
				output.write("Is dictionary empty: " + dictionary.isEmpty() + "\n");
				output.write("Entire dictionary is:\n");
				while (iteratorKey.hasNext())
				{
					key = iteratorKey.next();
					value = iteratorValue.next();
					output.write (key + " -> " + value +"\n");
				}
				
				key = "f";
				output.write("Is key " + key + " in the dictionary: " + dictionary.contains (key) + "\n");
				output.write("Value of key " + key + " is: " + dictionary.getValue(key) + "\n");
				output.write("Value " + dictionary.remove(key) + " of key " + key + " is removed" + "\n");
				output.write("Size of dictionary right now is: " + dictionary.getSize() + "\n");
				
				output.close();
			}
		}
		catch (IOException ieo)
		{
			ieo.printStackTrace();
		}
		
		//Clear the dictionary
		dictionary.clear();

	}
} // end UnsortedLinkedDictionary
		
