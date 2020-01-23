package ArrayStack2;
import ArrayStack2.ArrayStack2;

public class ArrayStack2Test {

	public static void main(String[] args) {
		
		ArrayStack2 stack;
		stack = new ArrayStack2();
		
		//Push values to the stack for testing
		for (int i = 0; i < 20; i++)
			stack.push(i);
		
		//Displays the entries in the stack starting from the top
		stack.display();
		
		//Removes the  entries in the stack from the top
		stack.remove(10);
		stack.display();	
	}
}