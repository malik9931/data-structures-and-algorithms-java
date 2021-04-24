package stacksandqueues;

public class Stack {
    Node top;

    public void push(int data){
        Node newTop = new Node(data);
        if(isEmpty()){
            top = newTop;
            return;
        }
        newTop.next = top;
        top = newTop;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception();
        }
        Node temp = top;
        top = top.next;
        temp.next = null;
        return (int) temp.value;
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception();
        }
        return (int) top.value;
    }

    public boolean isEmpty(){
        if (top==null)
        return true;
        return false;
    }

    // ------------------ toString Function ---------------------


    @Override
    public String toString() {
        String result = "";
        Node current = top;
        while (current != null){
            result = result + "{ " + current.value +" } -> ";

            current = current.next;
        }
        result = result+"NULL";
        return result;

    }
}
