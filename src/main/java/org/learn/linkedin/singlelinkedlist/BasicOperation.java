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

    void insertAtIndex(int data, int index){
        ListNode node = new ListNode(data);

        if(index == 1){
            ListNode r = head;
            head = node;
            node.next = r;
        }
        else{
            ListNode temp = head;
            int count = 1;
            while (count<index-1){
                temp = temp.next;
                count++;
            }
            ListNode t1 = temp.next;
            temp.next = node;
            node.next = t1;
        }
    }

    void deleteFirt(){
        ListNode node = head;
        head = head.next;
    }

    void deleteLast(){
        ListNode node = head;

        while (node.next.next != null){
            node = node.next;
        }
        System.out.println(node.data);
        node.next = null;
    }

    void deleteAtIndex(int index){
        if(index == 1){
            head = head.next;
        }
        else {
            int count =1;
            ListNode node = head;

            while (count<index-1){
                node = node.next;
                count++;
            }
            ListNode curr = node.next;
            node.next = node.next.next;
            System.out.println(curr.data);
        }
    }

    ListNode reverse(ListNode node){
        ListNode curr = head;
        ListNode nxt = null;
        ListNode pre = null;

        while (curr!=null){
            nxt = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nxt;
        }
        return pre;
    }

    public static void main(String[] args) {
        BasicOperation basicOperation = new BasicOperation();

        basicOperation.insertAtFirst(1);
        basicOperation.insertAtFirst(2);

        basicOperation.print();

        basicOperation.insert(5);
        basicOperation.insert(15);
        basicOperation.print();

        basicOperation.insertAtIndex(33,3);
        basicOperation.print();

        basicOperation.insertAtIndex(331121,1);
        basicOperation.print();

        basicOperation.deleteFirt();
        basicOperation.print();

        basicOperation.deleteLast();
        basicOperation.print();

        basicOperation.deleteAtIndex(3);
        basicOperation.print();

        basicOperation.head = basicOperation.reverse(basicOperation.head);
        basicOperation.print();
    }
}
