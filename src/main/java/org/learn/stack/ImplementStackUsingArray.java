package org.learn.stack;

public class ImplementStackUsingArray {

    int stack[];
    int size;
    int top;

    private ImplementStackUsingArray(int val){
        top =-1;
        size = val;
        stack = new int[val];
    }

    boolean isFull(){
       return  top==size-1;
    }

    boolean isEmpty(){
        return top<0;
    }

    void insert(int val){
        if(isFull()){
            System.out.println("stack is over flow");
            return;
        }
        else{
            stack[++top] = val;
        }
    }

    void pop(){
        if(isEmpty()){
            System.out.println("stack is under flow");
            return;
        }
        else{
            int p = stack[top];
            top--;
            System.out.println(p);
        }
    }

    void peek(){
        if(isEmpty()){
            System.out.println("stack is under flow");
            return;
        }
        else{
            System.out.println(stack[top]);
        }
    }

    void print(int[] stack){
        for(int i=0;i<stack.length;i++){
            System.out.print(stack[i]+" ");
        }
    }

    public static void main(String[] args) {
        ImplementStackUsingArray stackUsingArray = new ImplementStackUsingArray(4);

        System.out.println(stackUsingArray.isEmpty());

        stackUsingArray.insert(1);
        stackUsingArray.insert(1);
        stackUsingArray.insert(1);stackUsingArray.insert(1);
        stackUsingArray.insert(1);

        System.out.println(stackUsingArray.isEmpty());

        stackUsingArray.print(stackUsingArray.stack);

        System.out.println(stackUsingArray.isFull());

    }
}
