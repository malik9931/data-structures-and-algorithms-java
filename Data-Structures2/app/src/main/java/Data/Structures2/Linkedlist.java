package Data.Structures2;

public class Linkedlist{
    Node head;

//------------------------ First Code ----------------------------
    public boolean insert( int newHeadInsert){
        if(head == null){
            head = new Node(newHeadInsert);
            return true;
        }
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
        if (k >= size()){
            return -1;
        }
        int nodeToGet = this.size() - k;
        int counter = 1;
        Node current = head;
        while (counter < nodeToGet){
            counter++;
            current = current.next;
        }
        return current.value;

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

        return one;
    }
//------------------ palindrome Challenge ---------------
    public static boolean palindrome(Node head){

        if(head == null){
            return true;
        }
        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node secondHalfHead = reverse(slow.next);
        Node firstHalfHead = head;
        while (firstHalfHead != null && secondHalfHead != null){
            if(firstHalfHead.value != secondHalfHead.value){
                return false;
            }
            secondHalfHead = secondHalfHead.next;
            firstHalfHead = firstHalfHead.next;
        }
        return true;
    }

    private static Node reverse(Node head) {
        Node newHead = null;
        while (head != null){
            Node next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    // -------------------- size Function ---------------------

    public int size(){
        int size = 0;
        Node current = head;
        while (current != null){
            size++;
            current = current.next;
        }
        return size;
    }
//----------------- toString Function ----------------------
    public String toString(){
        String result = "";
        Node current = head;
        while (current != null){
            result = result + "{ " + current.value +" } -> ";

            current = current.next;
        }
        result = result+"NULL";
        return result;

    }
}
