package LinkedList;

public class AddTwoLL {
    public static void main(String[] args) {
        int[] arr1={2,4,9};
        int[] arr2={5,6,4,9};
        Node head1=convertArrayToDll(arr1);
        Node head2=convertArrayToDll(arr2);
        print(addTwoLL(head1,head2));


    }
    private static Node convertArrayToDll(int[] arr){
        return LinkedListt.convertArrToLL(arr);
    }
    private static Node addTwoLL(Node head1,Node head2)
    {
        Node dummyNode=new Node(0);
        Node current=dummyNode;
        Node t1=head1;
        Node t2=head2;
        int carry=0;
        while (t1 != null || t2 != null){
            int sum=carry;
            if (t1 !=null)
            {
                sum=sum+ t1.data;
            }
            if (t2 != null){
                sum=sum+ t2.data;
            }
            Node newNode=new Node(sum%10);
             carry=sum/10;
             current.next=newNode;
             current=current.next;
             if (t1!=null) t1=t1.next;
             if (t2 != null) t2=t2.next;

        }
        if (carry != 0){
            current.next= new Node(carry);
        }

        return dummyNode.next;
    }
    private static void print(Node head){
        Node temp=head;
        while (temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

}
