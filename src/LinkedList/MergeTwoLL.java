package LinkedList;

public class MergeTwoLL {
    public static void main(String[] args) {
        int[] arr1={2,4,8,10};
        int[] arr2={1,3,3,6,11,14};
        ListNode l1=LinkedListt.convertArrToLL(arr1);
        ListNode l2=LinkedListt.convertArrToLL(arr2);
        LinkedListt.print(merge(l1,l2));

    }
    public static ListNode merge(ListNode head1, ListNode head2 ){
        ListNode dummyNode=new ListNode(-1);
        ListNode temp=dummyNode;
        ListNode t1=head1;
        ListNode t2=head2;
        while (t1 != null && t2 != null){
            if (t1.data<t2.data){
                temp.next=t1;
                temp=t1;
                t1=t1.next;
            }
            else {
                temp.next=t2;
                temp=t2;
                t2=t2.next;
            }
        }
        if (t1 != null) temp.next=t1;
        else temp.next=t2;

        return dummyNode.next;
    }

}
