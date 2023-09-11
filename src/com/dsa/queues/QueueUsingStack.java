package com.dsa.queues;
import java.util.Stack;

public class QueueUsingStack {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> stackNew = new Stack<>();

    public void add(int item){
        stack.push(item);
    }

    public int remove(){
        //Todo: check isEmpty()
        while (!stack.isEmpty()){
            stackNew.push(stack.pop());
        }
        var c = stackNew.pop();
        while (!stackNew.isEmpty()){
            stack.push(stackNew.pop());
        }

        return c;
    }


    @Override
    public String toString() {
        return stack.toString();
    }
}
