package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceSumIsK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k=15;
        int index=0;
        int sum=0;
       List<Integer> result = new ArrayList<>();
        List<List<Integer>> subsets = sumOfSubstIsK(arr,result,k,index, sum);
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
        System.out.println("count is "+sumOfSubsetIsK(arr, k,index, sum));
        printFirst(arr,result,k,index,sum);
    }

    private static List<List<Integer>> sumOfSubstIsK(int[] arr, List<Integer> result,int k,int index,int sum) {
        List<List<Integer>> subset = new ArrayList<>();

        //base case
        if (index == arr.length) {
            if (sum == k) {
                subset.add(new ArrayList<>(result));
            }
            return subset;
        }

        //this is to take the element
        result.add(arr[index]);
        sum += arr[index];//add sum with the current index
        subset.addAll(sumOfSubstIsK(arr,result,k,index+1,sum));//calling the function recursive until the base case is not satisfied
        //removing the sum if we have to take another element while backtracking
        sum -= arr[index];
        //not take condition
        result.removeLast();
        subset.addAll(sumOfSubstIsK(arr,result,k,index+1,sum));

        return subset;
    }
    private static int sumOfSubsetIsK(int[] arr, int k, int index, int sum) {
        if (index == arr.length) {
            if (sum == k) {
                return 1;
            }
            else return 0;
        }
        sum += arr[index];
        int l=sumOfSubsetIsK(arr, k,index+1,sum);
        sum -= arr[index];
        int r=sumOfSubsetIsK(arr, k,index+1,sum);
        return l+r;
    }
    private static boolean printFirst(int[] arr, List<Integer> result, int k, int index, int sum)  {
        if (index == arr.length) {
            if (sum == k) {
                System.out.print("[");
                for (Integer integer : result) {

                    System.out.print(integer+",");
                }
                System.out.print("]");
                return true;
            }
            else return false;
        }
        sum += arr[index];
        result.add(arr[index]);
        if (printFirst(arr,result,k,index+1,sum)) {return true;}
        sum -= arr[index];
        result.removeLast();
        return printFirst(arr, result, k, index + 1, sum);
    }
}
