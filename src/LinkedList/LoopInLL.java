package LinkedList;


public class LoopInLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
       fifth.next=second;

        // Check if there is a loop
        // in the linked list
        if (detectLoop(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }

    }

    private static boolean detectLoop(ListNode head) {
        if (head==null||head.next==null) return false;
       ListNode slow=head;
       ListNode fast=head;
       while (fast != null&&fast.next !=null){
           slow=slow.next;
           fast=fast.next.next;
           if (slow==fast) return true;

       }
       return false;
    }
}
/*
 Node temp=head;
        Map<Node,Integer> map=new HashMap<>();
        while (temp != null){
            if (map.containsKey(temp)){
                return true;
            }
            map.put(temp,1);
            temp=temp.next;

        }
        return false;
 */
