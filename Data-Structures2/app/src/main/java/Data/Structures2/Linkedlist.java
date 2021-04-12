package Data.Structures2;

public class Linkedlist<T> {
    Node<T> head;

    public void append(String val){
        if(head == null){
            head = new Node(val);
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        Node lastNode = new Node(val);
        current.next =  lastNode;
//        lastNode.next = null;
//        int current = val;
//        if(head.v)
    }

    public void insertBefore(String value, String newVal){
        Node<T> current = head;
        Node<T> newValue = new Node(newVal);
        if(head.value == value){
            newValue.next = head;
            head = newValue;
        }
        while (current.next != null && current.next.value != value){

            current = current.next;
        }
        if(current.next != null){
            Node afterNew = current.next;
            current.next = newValue;
            newValue.next = afterNew;
            return;
        }

    }

    public void insertAfter(String value, String newVal){
        Node current = head;
        Node newNode = new Node(newVal);
        while (current != null && current.value != value){
            current = current.next;
        }
        if(current != null){
            newNode.next = current.next;
            current.next = newNode;

        }
    }

    public boolean insert(T newHeadInsert){
        Node newHead = new Node(newHeadInsert);
        newHead.next = head;
        head = newHead;
        return true;
    }

    public boolean includes(String data){
        if(head == null){
            head = new Node(data);
        }
        Node serchData = new Node(data);
        Node current = head;
        while (current.next != null){
            if(current.value == serchData.value){
                return true;
            }
            current = current.next;
        }
            return false;
    }

    public String kthFromEnd(int k){
        int elementsCounter = 0;
        Node needed;
//        if(head == null){
//            return "no data";
//        }else{
            Node current = head;

            while (current != null){
                elementsCounter++;
                current = current.next;
            }
            current = head;
            Node prev= head;
            for (int i = 0; i <  elementsCounter - k; i++) {
                prev = current;
                current = current.next;
            }
            needed = prev;
//            return (int) needed.value;
//            return elementsCounter;
        return (String) head.value;

    }


//    }

    public String toString(){
        String result = "";

        while (head != null){
            result = result + "{ " + head.value +" } -> ";

            head = head.next;
        }
        result = result+"NULL";
        return result;

    }
}
