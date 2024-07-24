package LinkedList;

public class LinkedListt {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        ListNode head=convertArrToLL(arr);

        int count=sizeOfLL(head);
        System.out.println(count);


    }
    public static ListNode convertArrToLL(int[] arr){
        ListNode head=new ListNode(arr[0]);
        ListNode mover=head;
        for (int i = 1; i < arr.length; i++) {
            ListNode temp=new ListNode(arr[i]);
            mover.next=temp;
            mover=temp;

        }
        return head;
    }
    public static int sizeOfLL(ListNode head){
        int count=0;
        ListNode temp=head;
        while (temp != null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public static boolean isPresent(ListNode head, int value){
        ListNode temp=head;
        while (temp != null) {
            if (temp.data == value) {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public static void print(ListNode head){
        ListNode temp=head;
        while (temp !=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public static ListNode deleteHead(ListNode head){

        if (head==null) return head;

        head=head.next;
        return head;

    }
    public static void deleteKthPosition(ListNode head, int k){
        if(head == null ) return;
        ListNode temp =head;
        if (k==1){
            head=head.next;
            return;
        }
        int count=0;
        ListNode previous= null;
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
    public static ListNode deleteTail(ListNode head){
        if (head == null||head.next==null) return head;
        ListNode temp=head;
        while (temp.next.next != null){
             temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public static void deleteMiddle(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        int n=(length/2)+1;
        deleteKthPosition(head,n);
    }
    public static ListNode deleteElement(ListNode head, int value){//this is only for unique values in LL for duplicates code in comment
        if (head==null) return null;

        if (head.data==value){
            head=head.next;
            return head;
        }
        ListNode previous=null;
        ListNode temp=head;
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
    public static ListNode insertValueAtFirst(ListNode head, int value){

        return new ListNode(value,head);
    }

    public static ListNode insertValueAtLast(ListNode head, int value){
        if(head==null){
            return new ListNode(value);
        }
        ListNode temp=head;
        while (temp.next !=null){
            temp=temp.next;
            }
            temp.next=new ListNode(value);


    return head;
    }
    public static ListNode insertValueAtk(ListNode head, int value, int k){
        if (head ==null) return new ListNode(value);
        if (k==1){
            return new ListNode(value,head);
        }
        int count=0;
        ListNode temp=head;
        while (temp != null){
            count++;
            if (count == k-1){
                ListNode newNode=new ListNode(value);
                newNode.next=temp.next;//first connect the new node to next node then connect the old one to the new node
                temp.next=newNode;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
    private static ListNode insertElementAtValueK(ListNode head, int value, int k){
        if (head ==null) return null;
        ListNode temp=head;

        if (temp.data==k){
            return new ListNode(value,head);
        }

        while (temp.next != null){

            if (temp.next.data == k){
                ListNode newNode=new ListNode(value);
                newNode.next=temp.next;//first connect the new node to next node then connect the old one to the new node
                temp.next=newNode;
                break;
            }
            temp=temp.next;
        }
        return head;
    }




}
class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next=null;
    }

    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
    ListNode head;

    public ListNode() {

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