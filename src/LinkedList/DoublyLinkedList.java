package LinkedList;

public class DoublyLinkedList {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,6};
        NodeForDLL head=convertArrayToDll(arr);
        head=deleteLast(head);
        print(head);
    }
    private static NodeForDLL deleteLast(NodeForDLL head){
        if (head==null || head.next==null) return null;
        NodeForDLL tail=head;

        while (tail.next != null){
            tail=tail.next;
        }
        NodeForDLL prev=tail.back;
        prev.next=null;
        tail.back=null;

        return head;
    }
    private static NodeForDLL deleteFirst(NodeForDLL head){
        if(head==null || head.next==null) return null;
        NodeForDLL prev=head;
        head=head.next;
        head.back=null;
        prev.next=null;

        return head;
    }

    private static NodeForDLL convertArrayToDll(int[] arr){
        NodeForDLL head=new NodeForDLL(arr[0]);
        NodeForDLL previous=head;
        for (int i = 1; i < arr.length; i++) {
            NodeForDLL temp=new NodeForDLL(arr[i],null,previous);
            previous.next=temp;
            previous=temp;
        }
        return head;
    }
    private static void print(NodeForDLL head){
        while (head != null){
            System.out.print(head.data+"->");
            head=head.next;
        }
    }


}
class NodeForDLL{
    int data;
    NodeForDLL next;
    NodeForDLL back;

    public NodeForDLL(int data, NodeForDLL next, NodeForDLL previous) {
        this.data = data;
        this.next = next;
        this.back = previous;
    }

    public NodeForDLL(int data) {
        this.data = data;
        this.next=null;
        this.back=null;
    }
}
