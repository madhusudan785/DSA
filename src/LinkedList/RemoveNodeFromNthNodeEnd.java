package LinkedList;

public class RemoveNodeFromNthNodeEnd {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,7};
        int n=6;
        ListNode head=LinkedListt.convertArrToLL(arr);
        head=removeNode(head,n);
        LinkedListt.print(head);

    }
    private static ListNode removeNode(ListNode head, int n){
        ListNode fast=head;
        for (int i = 0; i < n; i++) {
            fast=fast.next;
        }
        ListNode slow=head;
        if (fast == null) return head.next;

        while (fast.next != null){
            slow=slow.next;
            fast=fast.next;
        }

        slow.next=slow.next.next;
        System.gc();
        return head;
    }



}
