package LinkedList;

import java.util.Stack;

public class ReverseDLL {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        NodeForDLL head=convertArrayToDll(arr);
        head=reverse(head);
        print(head);

    }
    private static NodeForDLL reverse(NodeForDLL head){
        if (head==null && head.next==null) return null;

        NodeForDLL current=head;
        NodeForDLL last=null;
        while (current != null){
            last=current.back;
            current.back=current.next;
            current.next=last;
            current=current.back;
        }
        return last.back;
    }
    private static NodeForDLL convertArrayToDll(int[] arr){
        return DoublyLinkedList.convertArrayToDll(arr);
    }
    private static void print(NodeForDLL head){
        while (head != null){
            System.out.print(head.data+"->");
            head=head.next;
        }
    }

}
/*
brute force
NodeForDLL temp=head;
        Stack<Integer> stack=new Stack<>();
        while (temp != null){
            stack.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while (temp !=null){
            temp.data=stack.peek();
            stack.pop();
            temp=temp.next;
        }
 */