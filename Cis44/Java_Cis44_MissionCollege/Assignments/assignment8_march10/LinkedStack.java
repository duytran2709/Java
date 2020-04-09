/**
 * LinkedStack
 * 
 *
 */
public class LinkedStack<T> implements StackInterface<T> {

    private Node topNode;

    public LinkedStack() {
        topNode = null;
    }

    public void push(T data) {
        Node newNode = new Node(data, topNode);
        topNode = newNode;
    }

    public T peek() {
        T top = null;
        if (topNode != null) {
            top = topNode.getData();
        }
        return top;
    }

    public T pop() {
        T top = peek();
        if (topNode != null) {
            topNode = topNode.getNextNode();
        }
        return top;
    }

    public boolean isEmpty() {
        return topNode == null;
    }

    public void display() {

        T data = null; 
        while (topNode != null)
        {
            data = topNode.getData();
            System.out.println(data);
            topNode = topNode.getNextNode();

        }
    }

    private class Node {
        private Node next;
        private T data;

        private Node(T data) {
            this(data, null);
        }

        private Node(T data, Node nextNode) {
            this.data = data;
            next = nextNode;
        }

        private Node getNextNode() {
            return next;
        }

        private T getData() {
            return data;
        }

        private void setData(T data) {
            this.data = data;
        }

        private void setNextNode(Node nextNode) {
            next = nextNode;
        }

    }

}