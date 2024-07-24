package LinkedList;


public class IntersectionOfLL {
    public static void main(String[] args) {
        int[] arr1 = {4,1,8,4,5};
        int[] arr2 = {5,6,1,8,4,5};
        ListNode head1 = LinkedListt.convertArrToLL(arr1);
        ListNode head2 = LinkedListt.convertArrToLL(arr2);

        head2.next.next = head1.next.next;

        printLinkedList(head1);
        printLinkedList(head2);

        ListNode answerNode = getIntersectionNode(head1, head2);
        if (answerNode == null) {
            System.out.println("No intersection");
        } else {
            System.out.println("Intersected at '" + answerNode.data + "'");
        }
    }

    public static ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        ListNode t1=head1;
        ListNode t2=head2;
        if (t1 == null || t2 == null) return null;
        while (t1 != t2){
            t1=t1.next;
            t2=t2.next;
            if (t1 ==t2){
                return t1;
            }
            if (t1 == null) t1=head2;
            if (t2 == null) t2=head1;
        }
        return t1;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
/*
better
  int sizeOfHead1 = LinkedListt.sizeOfLL(head1);
        int sizeOfHead2 = LinkedListt.sizeOfLL(head2);
        if (sizeOfHead1 < sizeOfHead2) {
            return collisionPoint(head1, head2, sizeOfHead2 - sizeOfHead1);
        } else {
            return collisionPoint(head1, head2, sizeOfHead1 - sizeOfHead2);
        }


    private static Node collisionPoint(Node head1, Node head2, int diff) {
        if (diff > 0) {
            for (int i = 0; i < diff; i++) {
                head1 = head1.next;
            }
        } else {
            for (int i = 0; i < -diff; i++) {
                head2 = head2.next;
            }
        }
        while (head1 != null && head2 != null) {
            if (head1 == head2) {
                return head1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return null;
    }

brute force
HashSet<Node> st=new HashSet<>();
        while(head1 != null) {
            st.add(head1);
            head1 = head1.next;
        }
        while(head2 != null) {
            if(st.contains(head2)) return head2;
            head2 = head2.next;
        }
        return null;
 */