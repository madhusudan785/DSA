package LinkedList;

public class LinkedListt {
    public static void main(String[] args) {
        int[] arr={1,22,34,5,6,7};
        Node head=convertArrToLL(arr);
        deleteMiddle(head);
        print(head);


    }
    static Node convertArrToLL(int[] arr){
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
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    private static Node deleteHead(Node head){

        if (head==null) return head;

        head=head.next;
        return head;

    }
    private static void deleteKthPosition(Node head, int k){
        if(head == null ) return;
        Node temp =head;
        if (k==1){
            head=head.next;
            return;
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
    private static void deleteMiddle(Node head) {
        Node temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        int n=(length/2)+1;
        deleteKthPosition(head,n);
    }
    private static Node deleteElement(Node head,int value){//this is only for unique values in LL for duplicates code in comment
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
    private static Node insertValueAtk(Node head,int value,int k){
        if (head ==null) return new Node(value);
        if (k==1){
            return new Node(value,head);
        }
        int count=0;
        Node temp=head;
        while (temp != null){
            count++;
            if (count == k-1){
                Node newNode=new Node(value);
                newNode.next=temp.next;//first connect the new node to next node then connect the old one to the new node
                temp.next=newNode;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
    private static Node insertElementAtValueK(Node head,int value,int k){
        if (head ==null) return null;
        Node temp=head;

        if (temp.data==k){
            return new Node(value,head);
        }

        while (temp.next != null){

            if (temp.next.data == k){
                Node newNode=new Node(value);
                newNode.next=temp.next;//first connect the new node to next node then connect the old one to the new node
                temp.next=newNode;
                break;
            }
            temp=temp.next;
        }
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
 private static Node deleteElement(Node head,int value){
        Node dummy = new Node(0);
        dummy.next = head;
        Node current=dummy;
        while (current != null) {
            if (current.next != null && current.next.val == val) {
                current.next = current.next.next; // Remove the node by skipping it
            } else {
                current = current.next; // Move to the next node
            }
        }

        return dummy.next;
    }

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