package LinkedList;

public class ReverseListElementsInKGroups {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k=2;
        ListNode head=LinkedListt.convertArrToLL(arr);
        head=kReverse(head,k);
        LinkedListt.print(head);
    }
    static ListNode kReverse(ListNode head, int k) {

        ListNode temp = head;

        // Initialize a pointer to track the
        // last node of the previous group
        ListNode prevLast = null;


        while (temp != null) {


            ListNode kThNode = getKthNode(temp, k);

            // If the Kth node is NULL
            // (not a complete group)
            if (kThNode == null) {

                // If there was a previous group,
                // link the last node to the current node
                if (prevLast != null) {
                    prevLast.next = temp;
                }
                break;
            }

            // Store the next node
            // after the Kth node
            ListNode nextNode = kThNode.next;

            // Disconnect the Kth node
            // to prepare for reversal
            kThNode.next = null;

            // Reverse the nodes from
            // temp to the Kth node
            reverseLinkedList(temp);

            // Adjust the head if the reversal
            // starts from the head
            if (temp == head) {
                head = kThNode;
            } else {
                // Link the last node of the previous
                // group to the reversed group
                prevLast.next = kThNode;
            }

            // Update the pointer to the
            // last node of the previous group
            prevLast = temp;


            temp = nextNode;
        }


        return head;
    }
    static ListNode reverseLinkedList(ListNode head) {

        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;

    }

    static ListNode getKthNode(ListNode temp, int k) {
        k -= 1;//it's just simple count decreasing
        // Decrement K until it reaches
        // the desired position
        while (temp != null && k > 0) {
            // Decrement k as temp progresses
            k--;

            // Move to the next node
            temp = temp.next;
        }

        // Return the Kth node
        return temp;
    }



}
