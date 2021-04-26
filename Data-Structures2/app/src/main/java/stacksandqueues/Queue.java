package stacksandqueues;

public class Queue<T> {
    Node<T> front;
    Node<T> rear;

    public void enqueue(T data){
        Node<T> newNode = new Node<T>(data);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public T dequeue(){
        if(isEmpty()){
            throw new NullPointerException();
        }
        Node<T> temp = front;
        front= front.next;
        temp.next = null;
        return temp.value;
    }

    public T peek(){
        if(isEmpty()){
            throw new NullPointerException();
        }
        return front.value;
    }

    public boolean isEmpty(){
        if (front==null)
            return true;
        return false;
    }

    //-------------toString Function----------------

    @Override
    public String toString() {
        String result = "";
        Node current = front;
        while (current != null){
            result = result + "{ " + current.value +" } -> ";

            current = current.next;
        }
        result = result+"NULL";
        return result;
    }
}
