package LinkedList;

public class AddTwoLL {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 9};
        int[] arr2 = {5, 6, 4, 9};
        ListNode head1 = LinkedListt.convertArrToLL(arr1);
        ListNode head2 = LinkedListt.convertArrToLL(arr2);
        LinkedListt.print(addTwoLL(head1, head2));


    }
    private static ListNode addTwoLL(ListNode head1, ListNode head2)
    {
        ListNode dummyNode=new ListNode(0);
        ListNode current=dummyNode;
        ListNode t1=head1;
        ListNode t2=head2;
        int carry=0;
        while (t1 != null || t2 != null){
            int sum=carry;
            if (t1 !=null)
            {
                sum=sum+ t1.data;
            }
            if (t2 != null){
                sum=sum+ t2.data;
            }
            ListNode newNode=new ListNode(sum%10);
             carry=sum/10;
             current.next=newNode;
             current=current.next;
             if (t1!=null) t1=t1.next;
             if (t2 != null) t2=t2.next;

        }
        if (carry != 0){
            current.next= new ListNode(carry);
        }

        return dummyNode.next;
    }


}
