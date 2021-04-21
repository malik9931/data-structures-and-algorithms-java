package stacksandqueues;

public class Queue {
    Node front;
    Node rear;

    public void enqueue(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue(){
        if(isEmpty()){
            throw new NullPointerException();
        }
        Node temp = front;
        front= front.next;
        temp.next = null;
        return temp.value;
    }

    public int peek(){
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
