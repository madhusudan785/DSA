package LinkedList;

public class MiddleOfLL {
    public static void main(String[] args) {

        int[] arr={1,3,2,2,3,2};
        ListNode head=LinkedListt.convertArrToLL(arr);
        head=findMiddle(head);
        System.out.println(head.data);
    }

    public static ListNode findMiddle(ListNode head){
            // If the list is empty or has only one node
            // the middle is the head itself
            if (head == null || head.next == null) {
                return head;
            }

            // Initializing slow and fast pointers
            ListNode slow = head;
            ListNode fast = head.next;

            // Move the fast pointer twice
            // as fast as the slow pointer
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // When the fast pointer reaches the end,
            // the slow pointer will be at the middle
            return slow;
        }
    }

