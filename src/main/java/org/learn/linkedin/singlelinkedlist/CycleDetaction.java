package org.learn.linkedin.singlelinkedlist;

public class CycleDetaction {

    ListNode head;

    void print(){
        ListNode node = head;

        while (node!=null){
            System.out.print(node.data+" -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    boolean isLoop(){
        ListNode p1 = head;
        ListNode p2 = head;

        while(p1 != null && p1.next != null){
            p2 = p2.next;
            p1 = p1.next.next;

            if(p1==p2){
                return true;
            }

        }
        return false;
    }

    int findStartLoopPoint(){
        ListNode p1 = head;
        ListNode p2 = head;
        int data =0;

        while(p1 != null && p1.next != null){
            p2 = p2.next;
            p1 = p1.next.next;

            if(p1==p2){
               data = findStartingPoint(p1);
               break;
            }

        }
        return data;
    }

    int findStartingPoint(ListNode node){
        ListNode temp =head;

        while (temp != node){
            temp = temp.next;
            node = node.next;
        }
        System.out.println(temp.data);
        return temp.data;
    }

    void breakLoop() {
        ListNode p1 = head;
        ListNode p2 = head;


        while (p1 != null && p1.next != null) {
            p2 = p2.next;
            p1 = p1.next.next;

            if (p1 == p2) {
                getAndBreak(p1);
                break;
            }
        }
    }

    void getAndBreak(ListNode listNode){
        ListNode pre =null;
        ListNode temp = head;

        while (temp != listNode){
            pre = listNode;
            listNode = listNode.next;
            temp = temp.next;
        }
        pre.next = null;
    }



    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        CycleDetaction cycleDetaction = new CycleDetaction();

        cycleDetaction.head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node3;

        //cycleDetaction.print();

        System.out.println(cycleDetaction.isLoop());

        System.out.println("loop starting element is "+cycleDetaction.findStartLoopPoint());

        cycleDetaction.breakLoop();

        System.out.println(cycleDetaction.isLoop());
        cycleDetaction.print();
    }
}
