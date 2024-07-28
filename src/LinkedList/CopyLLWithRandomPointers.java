package LinkedList;

class Nodes {
    int val;
    Nodes next;
    Nodes random;
    Nodes(){
    this.val=0;
    this.next=null;
    this.random=null;
    }
    public Nodes(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
    public Nodes(int val, Nodes next, Nodes random) {
        this.val = val;
        this.next = next;
        this.random = random;
    }
}
public class CopyLLWithRandomPointers {
    public static void main(String[] args) {
        Nodes head = new Nodes(7);
        head.next = new Nodes(14);
        head.next.next = new Nodes(21);
        head.next.next.next = new Nodes(28);
        //random values
        head.random = head.next.next;
        head.next.random = head;
        head.next.next.random = head.next.next.next;
        head.next.next.next.random = head.next;
        head = copyLL(head);
        printClonedLinkedList(head);
    }

    private static Nodes copyLL(Nodes head) {
        if (head == null)  return null;
        //step-1 insert Node In between 2 Nodes
        insertInBetween(head);
        //step-2 Connect random points
        connectRandomPoint(head);

        return getConnectedNodes(head);

    }

    private static Nodes getConnectedNodes(Nodes head) {
        Nodes dummyNode=new Nodes(0);
        Nodes temp=head;
        Nodes result=dummyNode;
        while (temp != null){

            result.next=temp.next;
            temp.next=temp.next.next;

            result=result.next;
            temp=temp.next;
        }
        return dummyNode.next;

    }

    private static void connectRandomPoint(Nodes head) {
        Nodes temp=head;
        while (temp != null){
            Nodes copyNode=temp.next;
            if (temp.random != null)
                copyNode.random=temp.random.next;//any node pointing to a random node and that random node have copyNode ahead so .next
            else
                copyNode.random=null;

            temp=temp.next.next;
        }
    }

    static void insertInBetween(Nodes head){
        Nodes temp=head;
        while(temp!=null) {
            Nodes nextElement = temp.next;
            // Create a new node with the same data
            Nodes copy = new Nodes(temp.val);

            // Point the copy's next to
            // the original node's next
            copy.next = nextElement;

            // Point the original
            // node's next to the copy
            temp.next = copy;

            // Move to the next original node
            temp = nextElement;
        }
    }


    public static void printClonedLinkedList(Nodes head) {
        while (head != null) {
            System.out.print("Data: " + head.val);
            if (head.random != null) {
                System.out.print(", Random: " + head.random.val);
            } else {
                System.out.print(", Random: nullptr");
            }
            System.out.println();
            // Move to the next node in the list
            head = head.next;
        }
    }
}
/*
brute force
 Node temp = head;
        Map<Node, Node> map = new HashMap<Node, Node>();
        while (temp != null) {
            Node newNode = new Node(temp.val);
            map.put(temp, newNode);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            Node copyNode = map.get(temp);
            copyNode.next = map.get(temp.next);
            copyNode.random = map.get(temp.random);
            temp = temp.next;
        }
        return head;
 */