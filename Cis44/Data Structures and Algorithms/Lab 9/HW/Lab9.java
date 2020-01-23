package Lab9;
import java.util.Iterator;
import java.io.FileWriter;
import java.io.IOException;
public class Lab9 {

	public static void main(String[] args) {
		//Initial tree
		//Left branch: 3, 5, 6
		BinaryTree<Integer> leftTree = new BinaryTree();
		BinaryTree<Integer> left1 = new BinaryTree(3);
		BinaryTree<Integer> right1 = new BinaryTree(6);
		leftTree.setTree (5, left1, right1);
		
		//Right branch: 7, 8, 6
		BinaryTree<Integer> rightTree = new BinaryTree();
		BinaryTree<Integer> left2 = new BinaryTree(7);
		BinaryTree<Integer> right2 = new BinaryTree(6);
		rightTree.setTree(8, left2, right2);
		
		//Root: 7
		BinaryTree<Integer> tree = new BinaryTree();
		tree.setTree(7, leftTree, rightTree);
		
		try
		{
			FileWriter output = new FileWriter ("output.txt");
			if (output != null)
			{
				Iterator <Integer> iter = tree.getInorderIterator();
				//Showing value of the tree
				output.write ("The tree by Inorder Travelsing: ");
				while (iter.hasNext())
				{
					output.write (iter.next() + " ");
				}
				output.write("\n");
				
				//Count object
				int object1 = 3;
				int object2 = 6;
				output.write("\nNumber of object " + object1 + " using recursive method is: " + tree.count1(object1));
				output.write("\nNumber of object " + object2 + " using iterator is: " + tree.count2(object2));
				
				//Check isomorphic
				output.write("\nIs two branch of the tree Isomorphic: " + leftTree.isIsomorphic(rightTree));
				output.close();
			}
		}
		catch (IOException ieo)
		{
			ieo.printStackTrace();
		}
	
	}

}
