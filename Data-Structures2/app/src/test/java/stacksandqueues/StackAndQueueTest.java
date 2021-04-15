package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackAndQueueTest {

    @Test public void getTestStack() throws Exception {
        Stack testStack=new Stack();
        Stack testEmptyStack=new Stack();
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);
        System.out.println("Before pop: "+testStack);

        assertEquals(  3,testStack.pop());
        assertEquals("{ 2 } -> { 1 } -> NULL",testStack.toString());
        assertFalse(testStack.isEmpty());
        assertTrue(testEmptyStack.isEmpty());

        System.out.println("After pop: "+testStack);
        assertEquals(2,testStack.peek());

    }

    @Test public void getTestQueue(){
        Queue testQueue=new Queue();
        Queue testEmptyQueue=new Queue();

        testQueue.enqueue(1);
        testQueue.enqueue(2);
        testQueue.enqueue(3);
        System.out.println("Before dequeue: "+testQueue);

        assertEquals(  1,testQueue.dequeue());
        assertEquals("{ 2 } -> { 3 } -> NULL",testQueue.toString());
        assertFalse(testQueue.isEmpty());
        assertTrue(testEmptyQueue.isEmpty());
        System.out.println("After dequeue: "+testQueue);
        assertEquals(2,testQueue.peek());

    }

}