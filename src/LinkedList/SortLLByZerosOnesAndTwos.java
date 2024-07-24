package LinkedList;

public class SortLLByZerosOnesAndTwos {
    public static void main(String[] args) {
        int[] arr={0,0};
        ListNode head=convertArrayToll(arr);
        head=sortLL(head);
        print(head);
    }
    private static ListNode sortLL(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        ListNode zero = new ListNode(0);
        ListNode zeroHead = zero;
        ListNode one = new ListNode(1);
        ListNode oneHead = one;
        ListNode two = new ListNode(2);
        ListNode twoHead = two;


        while(temp!=null){

            if(temp.data==0){
                zero.next = temp;
                zero=temp;

            }
            else if(temp.data==1){
                one.next=temp;
                one=temp;

            }
            else if(temp.data==2){
                two.next=temp;
                two=temp;

            }
            temp=temp.next;

        }

        zero.next= (oneHead.next!=null) ? (oneHead.next) : (twoHead.next);
        one.next=twoHead.next;
        two.next=null;
        ListNode newhead= zeroHead.next;

        zeroHead.next=null;
        oneHead.next=null;
        twoHead.next=null;

        return newhead;
    }
    private static ListNode convertArrayToll(int[] arr){
        return LinkedListt.convertArrToLL(arr);
    }
    private static void print(ListNode head){
        ListNode temp=head;
        while (temp !=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
}
/*
brute force int count0=0,count1=0,count2=0;
        Node temp=head;
        while (temp != null){
            if (temp.data==0){
                count0++;
            } else if (temp.data==1) {
                count1++;
            }
            else {
                count2++;
            }
            temp=temp.next;
        }
        temp=head;
       while (temp != null){
           if (count0 >0) {
               temp.data = 0;
               count0--;
           } else if (count1>0) {
               temp.data=1;
               count1--;

           }
           else {
               temp.data=2;
               count2--;
           }
           temp=temp.next;
       }
 */