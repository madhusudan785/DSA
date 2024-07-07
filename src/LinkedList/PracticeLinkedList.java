package LinkedList;

/**
 * PracticeLinkedList
 */
public class PracticeLinkedList {
    private static Node head;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    public void addFirst(int val){
        Node newNode= new Node(val);
        if (head == null) 
        {
         head=newNode;
         return;    
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int val){
        Node newNode= new Node(val);
        if (head == null) 
        {
         head=newNode;
         return;    
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        } 
        temp.next=newNode;
    }
    public void print(Node head){
        Node temp=head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        PracticeLinkedList list=new PracticeLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addLast(4);
        list.addLast(5);
        list.print(head);
    }

}
