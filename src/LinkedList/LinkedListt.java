package LinkedList;

public class LinkedListt {
    public static void main(String[] args) {
        int[] arr={1,22,34,5,6,7};
        Node head=convertArrToLL(arr);
        print(deleteHead(head));



    }
    private static Node convertArrToLL(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for (int i = 1; i < arr.length; i++) {
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;

        }
        return head;
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
    private static boolean isPresent(Node head,int value){
        Node temp=head;
        while (temp != null) {
            if (temp.data == value) {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    private static void print(Node head){
        Node temp=head;
        while (temp !=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    private static Node deleteHead(Node head){

        if (head==null) return head;

        head=head.next;
        return head;

    }



}
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next=null;
    }
}
/*
        System.out.println("head of LL->"+head.data);
        Node temp=head;
        while (temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }System.out.println(isPresent(head,7));
        head=deleteHead(head);
        System.out.println("head of LL->"+head.data);
 */