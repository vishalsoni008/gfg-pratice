package org.learn.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    void push(int data){
        while(!queue1.isEmpty()){
            queue2.offer(queue1.poll());
        }
        queue1.offer(data);

        while(!queue2.isEmpty()){
            queue1.offer(queue2.poll());
        }
    }

    void pop(){
        int data = queue1.peek();
        queue1.poll();

        System.out.println(data);
    }
    public static void main(String[] args) {

        StackUsingQueue stackUsingQueue = new StackUsingQueue();

        stackUsingQueue.push(1);
        stackUsingQueue.push(2);
        stackUsingQueue.push(3);

        stackUsingQueue.pop();
        stackUsingQueue.pop();
        stackUsingQueue.pop();
    }
}
