package LinkedList;
import java.util.HashMap;
import java.util.Map;

public class LoopInLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

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

    private static boolean detectLoop(Node head) {
        if (head==null||head.next==null) return false;
       Node slow=head;
       Node fast=head;
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
