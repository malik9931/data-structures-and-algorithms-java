package Data.Structures2;

public class Linkedlist {
    Node head;

//    public void append(String val){
//        if(head == null){
//            head = new Node(val);
//            return;
//        }
//        Node current = head;
//        while (current.next != null){
//            current = current.next;
//        }
//        current.next = new Node(val);
////        int current = val;
////        if(head.v)
//    }

    public boolean insert(int newHeadInsert){
        Node newHead = new Node(newHeadInsert);
        newHead.next = head;
        head = newHead;
        return true;
    }

    public boolean includes(int data){
        if(head == null){
            return false;
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

    public String toString(){
        Node current = head;
        String result = "";
        while (current.next != null){
            result = result + "{ " + current.value +" } -> ";
            current = current.next;
        }
        result = result+"NULL";
        return result;
    }
}
