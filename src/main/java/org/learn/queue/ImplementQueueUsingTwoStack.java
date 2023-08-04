package org.learn.queue;

import java.util.Stack;

public class ImplementQueueUsingTwoStack {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    void enQueue(int val){

        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(val);

        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    void deQueue(){
        int data = stack1.peek();
        stack1.pop();
        System.out.println(data);
    }
    public static void main(String[] args) {

        ImplementQueueUsingTwoStack implementQueueUsingTwoStack = new ImplementQueueUsingTwoStack();

        implementQueueUsingTwoStack.enQueue(1);
        implementQueueUsingTwoStack.enQueue(2);
        implementQueueUsingTwoStack.enQueue(3);

        implementQueueUsingTwoStack.deQueue();
        implementQueueUsingTwoStack.deQueue();
        implementQueueUsingTwoStack.deQueue();

    }
}
