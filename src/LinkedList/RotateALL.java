package LinkedList;

public class RotateALL {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6};
        ListNode head=LinkedListt.convertArrToLL(arr);
        head=reverseLL(head);
        LinkedListt.print(head);

    }
    public static ListNode reverseLL(ListNode head){
        if (head==null || head.next ==null) return head;

        ListNode newHead=reverseLL(head.next);
           ListNode front= head.next;
           front.next=head;
           head.next=null;
           return newHead;

    }

}
/*
 if (head==null || head.next ==null) return head;
        Node temp=head;
        Node prev=null;
        while (temp != null) {
            Node front = temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }

        return prev;
 */