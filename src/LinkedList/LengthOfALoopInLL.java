package LinkedList;

public class LengthOfALoopInLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
//        Node third = new Node(3);
//        Node fourth = new Node(4);
//        Node fifth = new Node(5);

        head.next = second;
        second.next = head;
//        third.next = fourth;
//        fourth.next = fifth;
//
////         This creates a loop
//        fifth.next = second;

        int loopLength = lengthOfLoop(head);
        if (loopLength > 0) {
            System.out.println("Length of the loop: " + loopLength);
        } else {
            System.out.println("No loop found in the linked list.");
        }
        ListNode node = headOfLL(head);
        if (node !=null) {
            System.out.println("head is " + node.data);
        }
        else {
            System.out.println("no head");
        }
    }

    private static ListNode headOfLL(ListNode head){
        ListNode slow = head;
        ListNode fast=head;

        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                slow=head;
                return findHead(slow,fast);
            }
        }
        return null;
    }

    private static ListNode findHead(ListNode slow, ListNode fast) {

        while (slow != fast){
            slow=slow.next;
            fast=fast.next;
        }

        return slow;
    }

    private static int lengthOfLoop(ListNode head) {
        ListNode slow = head;
        ListNode fast=head;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if (slow==fast)
                return findLength(slow,fast);
        
        }
        return 0; // No loop

    }

    private static int findLength(ListNode slow, ListNode fast) {
        int count=1;
        fast=fast.next;
        while (slow!=fast){
            count++;
            fast=fast.next;
        }
        return count;
    }


}
/*
Map<Node, Integer> map = new HashMap<>();
        while (temp != null) {
            if (map.containsKey(temp)) {
                return timer - map.get(temp);
            }
            map.put(temp, timer);

            temp = temp.next;
            timer++;

        }
 */