package LinkedList;

import static LinkedList.MiddleOfLL.findMiddle;

public class SortALL {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        ListNode head=LinkedListt.convertArrToLL(arr);
        LinkedListt.print(sortOfLL(head));

    }
    private static ListNode sortOfLL(ListNode head){
        if (head==null || head.next==null) return head;

        ListNode middle= findMiddle(head);
        ListNode leftHead=head;
        ListNode rightHead=middle.next;
        middle.next=null;
        leftHead=sortOfLL(leftHead);
        rightHead=sortOfLL(rightHead);
       return MergeTwoLL.merge(leftHead,rightHead);
    }
}
/*
brute force
Node temp=head;
        ArrayList<Integer> list=new ArrayList<>();
        while (temp != null){

                list.add(temp.data);

            temp=temp.next;
        }
        Collections.sort(list);
        temp=head;
        for (Integer : list) {
            temp.data = integer;
            temp = temp.next;
        }
        return head;
 */