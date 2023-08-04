package org.learn.stack;

public class ImplementStackUsingLinkedList {

    static class Node{
        int data;
        Node next;

        private Node(int data){
            this.data = data;
        }
    }

    Node head;

    int length;
    int maxSize;
    Node top;

    private ImplementStackUsingLinkedList(int size){
        top = null;
        length = 0;
        this.maxSize = size;
    }

    private boolean isEmpty(){
        return length == 0;
    }

    private boolean isFull(){
        return length == maxSize;
    }

    private void push(int data){
        if(isFull()){
            System.out.println("stack over flow");
        }
        else {
            Node temp = new Node(data);
            temp.next = top;
            top = temp;
            length++;
        }

    }
    private void pop(){
        if(isEmpty()){
            System.out.println("stack is under flow");
            return;
        }
        else {
            int data = top.data;
            top = top.next;
            length--;
            System.out.println(data);

        }
    }

    void print(){
        Node node1 = top;

        while (node1!=null){
            System.out.print(node1.data+" ");
            node1 = node1.next;

        }
    }
    public static void main(String[] args) {

        ImplementStackUsingLinkedList implementStackUsingLinkedList = new ImplementStackUsingLinkedList(4);

        System.out.println(implementStackUsingLinkedList.isEmpty());
        System.out.println(implementStackUsingLinkedList.isFull());

        implementStackUsingLinkedList.push(1);
        implementStackUsingLinkedList.push(1);
        implementStackUsingLinkedList.push(1);
        implementStackUsingLinkedList.push(11);
        //implementStackUsingLinkedList.push(1);

        System.out.println(implementStackUsingLinkedList.isEmpty());
        System.out.println(implementStackUsingLinkedList.isFull());

        implementStackUsingLinkedList.print();

        implementStackUsingLinkedList.pop();

        implementStackUsingLinkedList.print();

    }
}
