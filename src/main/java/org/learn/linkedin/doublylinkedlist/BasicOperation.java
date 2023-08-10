package org.learn.linkedin.doublylinkedlist;

public class BasicOperation {

    ListNode head;
    ListNode tail;

    void insert(int data){
        ListNode node = new ListNode(data);

        if(head ==null){
            head = node;
            node.pre = null;
            tail = node;
        }
        else{
            ListNode temp = head;

            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
            tail = node;
            node.pre = temp;
        }
//        System.out.println(tail.data);
//        if(node.pre!= null) {
//            System.out.println(node.pre.data);
//        }
    }

    void print(){
        ListNode node = head;

        while (node != null){
            System.out.print(node.data+" -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    void insertAtFirst(int data){
        ListNode listNode = new ListNode(data);

        listNode.next = head;
        head = listNode;
        listNode.pre = null;
    }
    void removeFirst(){
        head = head.next;
        head.pre = null;
        //System.out.println(head.next.data+" "+head.pre);
    }

    void removeLast(){
        ListNode node =head;

        while (node.next.next != null){
            node = node.next;
        }
        ListNode curr = node;
        node.next = null;
        tail = node;
        System.out.println(tail.data+" "+node.pre.data);

    }

    void insertAtIndex(int data, int index){
        ListNode node = new ListNode(data);

        if(index == 1){
            node.next = head;
            head = node;
            head.pre = null;
        }
        else{
            int count =1;
            ListNode tmp = head;

            while(count<index-1){
                tmp = tmp.next;
                count++;
            }
            ListNode hold = tmp.next;
            tmp.next = node;
            node.next = hold;
            node.pre = tmp;
        }
    }

    void deleteAtIndex(int index){
        if(index == 1){
            head = head.next;
            head.pre = null;
        }
        else {
            int count =1;
            ListNode tmp =head;

            while (count<index-1){
                tmp = tmp.next;
                count++;
            }
            ListNode hold = tmp.next;
            tmp.next = tmp.next.next;
            tmp.pre = tmp;
        }
    }
    void reverse(){
        ListNode node = tail;

        while (node != head){
            System.out.print(node.data+" -> ");
            node = node.pre;
        }
        System.out.println(head.data+ " -> null");
    }

    public static void main(String[] args) {

        BasicOperation basicOperation = new BasicOperation();

        basicOperation.insert(1);
        basicOperation.insert(2);
        basicOperation.insert(3);
        basicOperation.insert(4);
        basicOperation.insert(5);
        basicOperation.insert(6);

        basicOperation.print();

        basicOperation.insertAtFirst(45);
        basicOperation.print();

        basicOperation.removeFirst();
        basicOperation.print();

        basicOperation.removeLast();
        basicOperation.print();

        basicOperation.insertAtIndex(55,2);
        basicOperation.print();

        basicOperation.deleteAtIndex(2);
        basicOperation.print();

        basicOperation.reverse();

        System.out.println("tail data is "+basicOperation.tail.data);
        System.out.println("head data is "+basicOperation.head.data);
    }
}
