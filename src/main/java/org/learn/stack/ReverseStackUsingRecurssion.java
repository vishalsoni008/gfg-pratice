package org.learn.stack;

import java.util.Stack;

public class ReverseStackUsingRecurssion {

    Stack<Integer> reverseStack = new Stack<>();

    void revrse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int data= stack.peek();
        reverseStack.add(data);
        stack.pop();
        revrse(stack);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);

        System.out.println("original stack peek " +stack.peek());

        System.out.println("original stak "+stack);

        ReverseStackUsingRecurssion reverseStackUsingRecurssion = new ReverseStackUsingRecurssion();

        reverseStackUsingRecurssion.revrse(stack);

        System.out.println("revese stack peek "+reverseStackUsingRecurssion.reverseStack.peek());
        System.out.println("reverse stack "+reverseStackUsingRecurssion.reverseStack);

    }
}
