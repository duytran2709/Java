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

    public void reverseListRecursive() {
        reverseListRecursive(topNode);
    }

    public void reverseListRecursive(Node current) {
        if (current != null) {
            reverseListRecursive(current.getNextNode());
            System.out.print(current.getData() + " ");
        }
    }

    public int recurive_sum(int number) {
        if (number >= 1)
            return number + recurive_sum(number - 1);
        else
            return number;
    }

    public int recurive_sum_even(int number) {
        int temp = number - 1;
        if (temp >= 1) {
            if (temp % 2 != 0)
                temp--;
            return temp + recurive_sum_even(temp - 1);

        } else
            return temp;

    }

    public int Fibonacci(int number) {
        if (number >= 3)
            return Fibonacci(number - 1) + Fibonacci(number - 2);
        else
            return 1;
    }

    public void insertionSort(T[] array, int n) {
        for (int currentIndex = 1; currentIndex < n; currentIndex++) {
            T item = array[currentIndex];
            int location = currentIndex;
            while (location > 0 && array[currentIndex - 1].equals(item)) {
                array[location] = array[location - 1];
                --location;
            }
            array[location] = item;
        }
    }

    public void display() {

        T data = null;
        Node temp = topNode;
        while (topNode != null) {
            data = topNode.getData();
            System.out.println(data);
            topNode = topNode.getNextNode();
        }

        topNode = temp;
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