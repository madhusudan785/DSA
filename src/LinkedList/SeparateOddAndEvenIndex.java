package LinkedList;

import static LinkedList.LinkedListt.convertArrToLL;
import static LinkedList.LinkedListt.print;

public class SeparateOddAndEvenIndex {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        ListNode head=convertArrToLL(arr);
        head=oddEvenList(head);

        print(head);

    }
    private static ListNode oddEvenList(ListNode head){
        //edge case always first
        if (head ==null || head.next==null) return head;
        //minimizing the space complexity
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenHead=even;
        while (even !=null && even.next != null){
            odd.next = odd.next.next; // move odd pointer
            odd = odd.next;

            even.next = even.next.next; // move even pointer
            even = even.next;

        }
        odd.next=evenHead;
        System.gc();

       return head;
    }



}
/*
brute force
 Node temp=head;
        if (head ==null || head.next==null);
        List<Integer> array=new ArrayList<>();

        while (temp != null && temp.next != null){
            array.add(temp.data);
            temp=temp.next.next;
        }
        if (temp != null){
            array.add(temp.data);
        }
        temp=head.next;
        while (temp != null && temp.next !=null){
            array.add(temp.data);

            temp=temp.next.next;
        }
        if (temp != null){
            array.add(temp.data);
        }
        int i=0;
        temp=head;
        while (temp != null){
            temp.data=array.get(i);
            i++;
            temp=temp.next;
        }
        return head;
 */