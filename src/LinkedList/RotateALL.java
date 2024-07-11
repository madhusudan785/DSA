package LinkedList;

public class RotateALL {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6};
        Node head=convertArrayToDll(arr);
        head=reverseLL(head);
        print(head);

    }
    private static Node reverseLL(Node head){
        if (head==null || head.next ==null) return head;
        Node temp=head;

           Node newHead=reverseLL(head.next);
           Node front= head.next;
           front.next=head;
           head.next=null;
           return newHead;

    }
    private static Node convertArrayToDll(int[] arr){
        return LinkedListt.convertArrToLL(arr);
    }
    private static void print(Node head){
        while (head != null){
            System.out.print(head.data+"->");
            head=head.next;
        }
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