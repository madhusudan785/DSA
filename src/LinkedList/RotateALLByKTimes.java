package LinkedList;

import org.w3c.dom.Node;

public class RotateALLByKTimes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k=3;
       ListNode head=LinkedListt.convertArrToLL(arr);
       head=rotateRight(head,k);
       LinkedListt.print(head);
    }
    private static ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;

        ListNode tail=head;
        int length=1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        if (k%length == 0) { return head; }

        k=k%length;

        tail.next=head;

        ListNode newTail = findNthNode(head,length-k);
        head=newTail.next;
        newTail.next=null;
        return head;
    }

    public static ListNode findNthNode(ListNode head, int i) {
        ListNode temp = head;
        int count = 1;
        while (temp!= null) {
            if (count == i) {return temp;}
            count++;
            temp=temp.next;
        }

        return temp;
    }
}
