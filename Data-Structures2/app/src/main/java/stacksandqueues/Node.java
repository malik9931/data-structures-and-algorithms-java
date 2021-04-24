package stacksandqueues;

public class Node<T> {

    Node next;
    T value;

    // Connect each Node with the next Node

    public Node(T val){
        this.value = val;
//        next = null;
    }
}
