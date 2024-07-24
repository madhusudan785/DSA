package LinkedList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PossibleSumPairs {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int sum=5;
        NodeForDLL head=DoublyLinkedList.convertArrayToDll(arr);
        Map<Integer, Integer> pairs = findPairs(head, sum);
        pairs.forEach((k,v)->System.out.println(k+"->"+v));
    }
    private static Map<Integer,Integer> findPairs(NodeForDLL head,int sum){
        NodeForDLL left=head;
        NodeForDLL right=DoublyLinkedList.findTail(head);
        Map<Integer,Integer> map=new HashMap<>();
        while (left.data <right.data){
            if (left.data+right.data==sum){
                map.put(left.data, right.data);
                left=left.next;
                right=right.back;
            }
            else if (left.data+right.data<sum){
                left=left.next;
            }
            else {
                right=right.back;
            }
        }

        return map;
    }

}
/*
//brute force
        NodeForDLL temp=head;
        Map<Integer,Integer> map=new HashMap<>();
        while (temp!=null){
            NodeForDLL temp1=temp.next;
            while (temp1 != null && temp.data+temp1.data<=sum){
                if (temp.data+temp1.data==sum){
                    map.put(temp.data,temp1.data);
                }
                temp1=temp1.next;
            }
            temp=temp.next;
        }

 */