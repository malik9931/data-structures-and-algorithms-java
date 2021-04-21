package stacksandqueues;

public class AppStack {
    public static void main(String[] args){

        try {
            // -----------------------------------STACK PART--------------------
            Stack newStack = new Stack();
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(3);

            //-------------------Testing------------------
//        System.out.println(newStack.pop());
//        System.out.println(newStack.isEmpty());
//        System.out.println(newStack);
//            System.out.println(newStack.peek());

            //----------------------------------QUEUE PART--------------------------
            Queue newQueue = new Queue();
            newQueue.enqueue(1);
//            System.out.println(newQueue);
//            System.out.println(newQueue.dequeue());
//            System.out.println(newQueue.dequeue());
//
//            System.out.println(newQueue.isEmpty());

            //----------------------------------Implement a Queue using two stacks PART--------------------------
            PseudoQueue newPseudoQueue = new PseudoQueue();
            newPseudoQueue.enqueue(1);
            newPseudoQueue.enqueue(2);
            newPseudoQueue.enqueue(3);
            newPseudoQueue.enqueue(4);

            System.out.println(newPseudoQueue.toString());
            System.out.println(newPseudoQueue.dequeue());
            System.out.println(newPseudoQueue.dequeue());
            System.out.println(newPseudoQueue.dequeue());




        }catch (Exception ex){
            ex.getStackTrace();
            System.out.println("Error in "+ ex);
        }

    }
}
