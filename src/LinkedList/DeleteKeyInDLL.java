package LinkedList;

public class DeleteKeyInDLL {
    public static void main(String[] args) {
        int[] arr={10,2,10,10};
        int key=10;
        NodeForDLL head=DoublyLinkedList.convertArrayToDll(arr);
        head=removeKey(head,key);
        DoublyLinkedList.print(head);
    }
    private static NodeForDLL removeKey(NodeForDLL head,int key){
        NodeForDLL temp=head;

        while (temp != null){
            if (temp.data==key){
                if (temp==head){
                    head=head.next;
                }
                NodeForDLL previous=temp.back;
                NodeForDLL front=temp.next;
                if (front != null) front.back=previous;
                if (previous != null) previous.next=front;
                temp=front;
            }
            else {
                temp=temp.next;
            }

        }
        System.gc();
        return head;

    }

}
