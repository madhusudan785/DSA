package LinkedList;

public class FlatteningALL {
    public static void main(String[] args) {
        MyNode head = new MyNode(5);
        head.child = new MyNode(14);

        head.next = new MyNode(10);
        head.next.child = new MyNode(4);

        head.next.next = new MyNode(12);
        head.next.next.child = new MyNode(20);
        head.next.next.child.child = new MyNode(13);

        head.next.next.next = new MyNode(7);
        head.next.next.next.child = new MyNode(17);
        printLinkedList(flattenLL(head));


    }
    private static MyNode flattenLL(MyNode head){

        if(head == null || head.next==null) return head;

        MyNode mergedHead=flattenLL(head.next);
        return mergeTwoLinkedList(head,mergedHead);
    }


    private static MyNode mergeTwoLinkedList(MyNode list1, MyNode list2) {
        MyNode dummyNode=new MyNode(0);
        MyNode res=dummyNode;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                res.child = list1;
                res = list1;
                list1 = list1.child;
            } else {
                res.child = list2;
                res = list2;
                list2 = list2.child;
            }
            res.next = null;
        }
        // Connect the remaining
        // elements if any
        if (list1 != null) {
            res.child = list1;
        } else {
            res.child = list2;
        }

        // Break the last node's
        // link to prevent cycles
        if (dummyNode.child != null) {
            dummyNode.child.next = null;
        }

        return dummyNode.child;
    }


    static void printLinkedList(MyNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.child;//.child is only for vertical traversal
        }
        System.out.println();
    }


}
class MyNode  {
    int val;
    MyNode next;
    MyNode child;
    MyNode(){
        this.val=0;
        this.next=null;
        this.child=null;
    }
    public MyNode(int val) {
        this.val = val;
        this.next = null;
        this.child = null;
    }
    public MyNode(int val, MyNode next, MyNode child) {
        this.val = val;
        this.next = next;
        this.child = child;
    }
}
/*
  ArrayList<Integer> arr = new ArrayList<>();

        while (head != null) {

            MyNode t2 = head;
            while (t2 != null) {
                // Store each node's data in the ArrayList
                arr.add(t2.val);
                // Move to the next child node
                t2 = t2.child;
            }

            head = head.next;
        }


        Collections.sort(arr);

        return convert(arr);

         private static MyNode convert(ArrayList<Integer> arr) {
        MyNode dummyNode=new MyNode(0);
        MyNode temp=dummyNode;
        for (Integer : arr) {
            temp.child = new MyNode(integer);
            temp = temp.child;//.child is only for vertical traversal
        }
        return dummyNode.child;
    }

 */