package Lab10;
import java.io.FileWriter;
import java.io.IOException;

public class Lab10_Test {

	public static void main(String[] args) {
		BinarySearchTree <Integer> tree = new BinarySearchTree();
		
		try
		{
			FileWriter output = new FileWriter ("output.txt");
			if (output != null)
			{
				/*
				 * Tree
								15
							 /		\
						    10		20
						   /  \	   /  \
						  8   12  17   25
								 /  \
								16	18
				*/
				
				int[] treeValues = {15, 10, 20, 8, 12, 17, 25, 16, 18};
				//Printing values of the tree
				for (int index = 0; index < treeValues.length; index++)
				{
					tree.add(treeValues[index]);
					output.write("Added: " +treeValues[index] + "\n");
				}
				//Check balance
				output.write("\nIs balanced: " + tree.isBalanced());
				//Check BST
				output.write("\nIs BST: " + tree.isBST());
				//Show predecessor
				output.write("\nThe predecessor of 20 is: " + tree.getPredecessor(20));
				
				output.close();
			}
		}
		catch (IOException eio)
	    {
	    	eio.printStackTrace();
	    }

	}

}
