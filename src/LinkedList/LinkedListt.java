package LinkedList;

public class LinkedListt {
    public static void main(String[] args) {
        int[] arr={1,22,34,5,6,7};
        Node head=convertArrToLL(arr);

        print(head);


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
    private static Node deleteKthPosition(Node head,int k){
        if(head == null ) return null;
        Node temp =head;
        if (k==1){
            head=head.next;
            return head;
        }
        int count=0;
        Node previous= null;
        while (temp != null){
            count++;
            if (count==k){
                previous.next=previous.next.next;
                break;
            }
            previous=temp;
            temp=temp.next;

        }
        return head;
    }
    private static Node deleteTail(Node head){
        if (head == null||head.next==null) return head;
        Node temp=head;
        while (temp.next.next != null){
             temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    private static Node deleteElement(Node head,int value){
        if (head==null) return null;

        if (head.data==value){
            head=head.next;
            return head;
        }
        Node previous=null;
        Node temp=head;
        while (temp != null){
            if (temp.data==value){
                previous.next=previous.next.next;
                break;
            }
            previous=temp;
            temp=temp.next;

        }
        return head;
    }
    private static Node insertValueAtFirst(Node head,int value){

        return new Node(value,head);
    }
    private static Node insertValueAtLast(Node head,int value){
        if(head==null){
            return new Node(value);
        }
        Node temp=head;
        while (temp.next !=null){
            temp=temp.next;
            }
            temp.next=new Node(value);


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

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
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
         Node head=convertArrToLL(arr);
        print(deleteHead(head));
        head=deleteKthPosition(head,5);
        head=deleteElement(head,34);
         head=insertValueAtLast(head,12);
 */