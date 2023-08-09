package org.learn.linkedin.singlelinkedlist;

public class BasicOperation {

    ListNode head;

    void insertAtFirst(int data){
        ListNode listNode = new ListNode(data);

        if(head == null){
            head = listNode;
            return;
        }
        else {
            listNode.next = head;
            head = listNode;
            return;
        }
    }

    private void insert(int data){
        ListNode node = new ListNode(data);

        if(head == null){
            head = node;
        }
        else{
            ListNode node1 = head;
            while (node1.next != null){
                node1 = node1.next;
            }
            node1.next = node;
            return;
        }
    }

    void print(){
        ListNode node = head;
        while(node!=null){
            System.out.print(node.data+" -> ");
            node = node.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        BasicOperation basicOperation = new BasicOperation();

        basicOperation.insertAtFirst(1);
        basicOperation.insertAtFirst(2);

        basicOperation.print();

        basicOperation.insert(5);
        basicOperation.insert(15);
        basicOperation.print();
    }
}
