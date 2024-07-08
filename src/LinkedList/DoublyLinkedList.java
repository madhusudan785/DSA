package LinkedList;

import ArrayQuestion.NextPermutation;

public class DoublyLinkedList {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,6};
        NodeForDLL head=convertArrayToDll(arr);
//        deleteNode(head.next.next);
        insertValBeforeNode(head.next.next,23);
        print(head);
    }

    private static void insertValBeforeNode(NodeForDLL node,int val){
        NodeForDLL prev=node.back;
        NodeForDLL newNode=new NodeForDLL(val,node,prev);
        prev.next=newNode;
        node.back=newNode;
    }

    private static NodeForDLL insertValBeforeK(NodeForDLL head,int k,int val){
        if (k==1) return insertBeforeHead(head,val);

        NodeForDLL temp=head;
        int count=0;
        while (temp != null){
            count++;
            if (count==k) break;
            temp=temp.next;
        }
        NodeForDLL previous=temp.back;
        NodeForDLL newNode=new NodeForDLL(val,temp,previous);
        previous.next=newNode;
        temp.back=newNode;

        return head;

    }
    private static NodeForDLL insertBeforeTail(NodeForDLL head,int value){
        if (head.next==null){
            return insertBeforeHead(head,value);
        }
        NodeForDLL tail=head;
        while (tail.next != null){
            tail=tail.next;
        }
        NodeForDLL previous=tail.back;
        NodeForDLL newNode=new NodeForDLL(value,tail,previous);
        previous.next=newNode;
        tail.back=newNode;
        return head;

    }

    private static NodeForDLL insertBeforeHead(NodeForDLL head,int value){
        NodeForDLL newHead=new NodeForDLL(value,head,null);

        head.back=newHead;
        return newHead;
    }

    private static void deleteNode(NodeForDLL temp){
        NodeForDLL prev=temp.back;
        NodeForDLL front=temp.next;
        if (front==null){
            prev.next=null;
            temp.back=null;
        }
        prev.next=front;
        front.back=prev;
        temp.next=temp.back=null;

    }

    private static NodeForDLL deleteK(NodeForDLL head,int k){
        if (head==null) return null;

        NodeForDLL temp=head;

        int count=0;

        while (temp != null){
            count++;
            if (count==k) {break;}
            temp=temp.next;
        }

        NodeForDLL prev=temp.back;
        NodeForDLL front=temp.next;


        if (prev ==null && front==null){
            return null;
        }
        else if (prev==null){
            return deleteFirst(head);
        } else if (front==null) {
           return deleteLast(head);
        }
            prev.next=front;
            front.back=prev;
            temp.next=null;
            temp.back=null;

        return head;
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

    public static NodeForDLL convertArrayToDll(int[] arr){
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
