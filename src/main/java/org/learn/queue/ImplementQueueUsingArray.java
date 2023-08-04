package org.learn.queue;

public class ImplementQueueUsingArray {
    int top;
    int low;
    int size;

    int[] queue;

    private ImplementQueueUsingArray(int size){
        this.size = size;
        top=0;
        low =0;
        queue = new int[size];
    }

    boolean isEmpty(){
        return top==low;
    }
    boolean isFull(){
        return top == size-1;
    }

    void enQueue(int data){
        if(isFull()){
            System.out.println("queue is full");
        }
        else {
            queue[top] = data;
            top++;
        }
    }

    void deQueue(){
        if(isEmpty()){
            System.out.println("quwuw is empty");
            return;
        }
        else{
            for(int i=0;i<top-1;i++){
                queue[i] = queue[i+1];
            }
            if(top<size){
                queue[top] =0;
            }
            top--;
        }
    }

    void print(int[] queue){

        for(int i=0;i<top;i++){
            System.out.print(queue[i]+" ");
        }
    }

    public static void main(String[] args) {

        ImplementQueueUsingArray implementQueueUsingArray = new ImplementQueueUsingArray(4);

        System.out.println(implementQueueUsingArray.isEmpty());
        System.out.println(implementQueueUsingArray.isFull());

        implementQueueUsingArray.enQueue(12);
        implementQueueUsingArray.enQueue(2);
        implementQueueUsingArray.enQueue(2);
        implementQueueUsingArray.enQueue(2);

        implementQueueUsingArray.print(implementQueueUsingArray.queue);

        implementQueueUsingArray.deQueue();
        System.out.println();

        implementQueueUsingArray.print(implementQueueUsingArray.queue);


        System.out.println(implementQueueUsingArray.isEmpty());
        System.out.println(implementQueueUsingArray.isFull());




    }
}
