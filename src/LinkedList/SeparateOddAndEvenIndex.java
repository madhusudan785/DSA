package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class SeparateOddAndEvenIndex {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Node head=convertArrayToDll(arr);
        head=oddEvenList(head);

        print(head);

    }
    private static Node oddEvenList(Node head){
        //edge case always first
        if (head ==null || head.next==null) return head;
        //minimizing the space complexity
        Node odd=head;
        Node even=head.next;
        Node evenHead=even;
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

    private static Node convertArrayToDll(int[] arr){
        return LinkedListt.convertArrToLL(arr);
    }
    private static void print(Node head){
        Node temp=head;
        while (temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    private static int sizeOfLL(Node head){
        int count=0;
        Node temp=head;
        while (temp != null){
            temp=temp.next;
            count++;
        }
        return count;
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