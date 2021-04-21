package stacksandqueues;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class PseudoQueue {
    private Stack inputStack ; // Input Stack
    private Stack outputStack ; // Output Stack

    public PseudoQueue(){
        inputStack = new Stack();
        outputStack = new Stack();
    }

    public void enqueue(int value){
        inputStack.push(value);

    }

    public int dequeue() throws Exception {
        // fill out all the Input if output stack is empty
        if(outputStack.isEmpty()){
            while (!inputStack.isEmpty()){
                outputStack.push(inputStack.pop());
            }
        }
        int temp = 0;
        if(!outputStack.isEmpty()){
            temp = outputStack.pop();
        }else {
            throw new NoSuchElementException();
        }
        return temp;
    }

    public int peek(){
        if(inputStack.top == null){
            throw new EmptyStackException();
        }else {
            return inputStack.top.value;
        }
    }

    @Override
    public String toString() {
        return "PseudoQueue{" +
                "inputStack=" + inputStack +
                ", outputStack=" + outputStack +
                '}';
    }
}
