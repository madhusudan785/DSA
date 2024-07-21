package LinkedList;

import java.util.HashMap;
import java.util.HashSet;


public class IntersectionOfLL {
    public static void main(String[] args) {
        int[] arr1={4,1};
        int[] arr2={5,6};
        Node head1=LinkedListt.convertArrToLL(arr1);
        Node head2= LinkedListt.convertArrToLL(arr2);
//        head2.next.next.next = head1.next.next;
        printLinkedList(head1);
        printLinkedList(head2);
        Node answerNode=getIntersectionNode(head1,head2);
        if (answerNode==null){
            System.out.println("not intersect");
        }
        else {
        System.out.println("intersect on "+answerNode.data);
    }
    }
    public static Node getIntersectionNode(Node head1, Node head2) {
        HashSet<Node> st=new HashSet<>();
        while(head1 != null) {
            st.add(head1);
            head1 = head1.next;
        }
        while(head2 != null) {
            if(st.contains(head2)) return head2;
            head2 = head2.next;
        }
        return null;
    }
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
