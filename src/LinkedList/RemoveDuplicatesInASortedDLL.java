package LinkedList;

public class RemoveDuplicatesInASortedDLL {
    public static void main(String[] args) {
        int[] arr={1,1,3,3,21,22,22,33};
        NodeForDLL head=DoublyLinkedList.convertArrayToDll(arr);

        DoublyLinkedList.print(removeDuplicates(head));
    }
    private static NodeForDLL removeDuplicates(NodeForDLL head) {
        NodeForDLL temp=head;

        while (temp!=null && temp.next!=null){
            NodeForDLL nextNode=temp.next;
            while (nextNode!=null && nextNode.data==temp.data) {
                    nextNode = nextNode.next;
                }
                temp.next =nextNode;

                if (nextNode != null) nextNode.back = temp;
            temp=temp.next;
            }
        return head;
    }
    }

