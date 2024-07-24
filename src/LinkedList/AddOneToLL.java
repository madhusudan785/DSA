package LinkedList;

public class AddOneToLL {
    public static void main(String[] args) {
        int[] arr={1,5,9};
        ListNode head=LinkedListt.convertArrToLL(arr);
        head=AddOne(head);
        LinkedListt.print(head);


    }
    private static ListNode AddOne(ListNode head){
    //step->1
        int carry=helper(head);
        //step->2
            if (carry==1){
                ListNode newNode =new ListNode(1);
                newNode.next=head;
                return newNode;

            }

        return head;
    }

    private static int helper(ListNode head) {
        ListNode temp=head;
        int carry=1;
        if (temp == null){
            return 1;
        }
        carry=helper(head.next);
        temp.data= temp.data+carry;
        if (temp.data <10)
            return 0;
        temp.data=0;
        return 1;
    }

}
/*
T.C->O(3n)
head=RotateALL.reverseLL(head);
        //step->2
        int carry=1;
        Node temp=head;
        while(temp != null){
            temp.data=temp.data+carry;

            if (temp.data <10){
                carry=0;
                break;
            }
            else {
                temp.data=0;
                carry=1;
            }
            temp=temp.next;
        }
        if (carry ==1){
            Node newNode =new Node(1);
            head=RotateALL.reverseLL(head);
            newNode.next=head;
            return newNode;
        }
        head=RotateALL.reverseLL(head);
        return head;

 */
