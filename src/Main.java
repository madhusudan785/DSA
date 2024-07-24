class LinkedListt {
    static class Node1 {
        int value;
        Node1 next;

        Node1(int d) {
            value = d;
            next = null;
        }
    }

    Node1 head;

    public boolean checkLoop() {
        Node1 first = head;
        Node1 second = head;

        while (first != null && first.next != null) {
            first = first.next.next;
            second = second.next;

            if (first == second) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListt linkedList = new LinkedListt();

        linkedList.head = new Node1(1);
        Node1 second = new Node1(2);
        Node1 third = new Node1(3);
        Node1 fourth = new Node1(4);

        linkedList.head.next = second;
        second.next = third;
        third.next = fourth;

        // Create a loop in the LinkedList
        fourth.next = second;

        System.out.print("LinkedList: ");
        int i = 1;
        while (i <= 4) {
            System.out.print(linkedList.head.value + " ");
            linkedList.head = linkedList.head.next;
            i++;
        }

        boolean loop = linkedList.checkLoop();
        if (loop) {
            System.out.println("\nThere is a loop in the LinkedList.");
        } else {
            System.out.println("\nThere is no loop in the LinkedList.");
        }
    }
}
