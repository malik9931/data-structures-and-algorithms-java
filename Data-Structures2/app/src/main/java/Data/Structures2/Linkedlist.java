package Data.Structures2;

public class Linkedlist{
    Node head;

//------------------------ First Code ----------------------------
    public boolean insert( int newHeadInsert){
        Node newHead = new Node(newHeadInsert);
        newHead.next = head;
        head = newHead;
        return true;
    }

    public boolean includes(int data){
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
// ----------------------------- 2nd Challenge -------------------------------
public void append(int val){
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

    public void insertBefore(int value, int newVal){
        Node current = head;
        Node newValue = new Node(newVal);
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

    public void insertAfter(int value, int newVal){
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


//------------------------------- 3rd Challenge ----------------------------------

    public int kthFromEnd(int k){
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
        return head.value;

    }

// --------------------------------------- 4th Challenge --------------------------------

    public static Linkedlist zipLists(Linkedlist one, Linkedlist two){
        Node oneCurr = one.head;
        Node twoCurr = two.head;

        Node oneNext;
        Node twoNext;

        while (oneCurr != null && twoCurr != null){
            oneNext = oneCurr.next;
            twoNext = twoCurr.next;

            oneCurr.next = twoNext;
            twoCurr.next = oneNext;

            oneCurr=oneNext;
            twoCurr=twoNext;

        }

        return two;
    }

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
