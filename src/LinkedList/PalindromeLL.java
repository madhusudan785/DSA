package LinkedList;

import static LinkedList.LinkedListt.convertArrToLL;

public class PalindromeLL {
    public static void main(String[] args) {
        int[] sr={1,1,2,3,2,1,1};
        ListNode head=convertArrToLL(sr);
        boolean result=palindrome(head);
        System.out.println(result);

    }
    private static boolean palindrome(ListNode head){
        if (head == null || head.next == null) {
            // It's a palindrome by definition
            return true;
        }
        ListNode fast=head;
        ListNode slow=head;
        while (fast.next !=null && fast.next.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode newHead=RotateALL.reverseLL(slow.next);
        ListNode first=head;
        ListNode second =newHead;
        while (second != null){
            if (first.data!=second.data){
                RotateALL.reverseLL(newHead);
                return false;
            }
            first=first.next;
            second=second.next;
        }

        return true;
    }


}
/*
  Stack<Integer> stack=new Stack<>();
        Node temp=head;
        while (temp != null){
            stack.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while (temp != null){
            if (temp.data !=stack.peek()){
                return false;
            }
            stack.pop();
            temp=temp.next;
        }

 */