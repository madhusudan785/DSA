package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//part-1
public class CombinationSum {
    public static void main(String[] args) {
        int[] nums = {10,1,2,7,6,1,5};
        int target = 8;
        List<Integer> result = new ArrayList<>();
        List<List<Integer>> subsets = uniqueSumOfSubsetIsk(nums,target,0,result);
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }

    }
//    part-2
    private static List<List<Integer>> uniqueSumOfSubsetIsk(int[] arr, int target,int index,List<Integer> result) {
        List<List<Integer>> subsets=new ArrayList<>();
        Arrays.sort(arr);
         if (target == 0) {
             subsets.add(new ArrayList<>(result));
             return subsets;
        }
         for (int i = index; i < arr.length; i++) {
             if (i>index && arr[i] == arr[i-1]) { continue;}//this is for when an element starts repeating
             if (arr[i] > target) {break;}//this is a sorted array if in case an element greater than the target then no sense to take the recursion further

             result.add(arr[i]);
             subsets.addAll(uniqueSumOfSubsetIsk(arr, target-arr[i], i+1, result));
             result.removeLast();
         }
         return subsets;

    }
    private static List<List<Integer>> sumOfSubstIsK(int[] arr, List<Integer> result, int target, int index) {
        List<List<Integer>> subset = new ArrayList<>();

        //base case
        if (index == arr.length) {
            if (target == 0) {
                subset.add(new ArrayList<>(result));
            }
            return subset;
        }

        if (arr[index] <= target) {
            //this is to take the element
            result.add(arr[index]);
            subset.addAll(sumOfSubstIsK(arr, result, target-arr[index], index));//calling the function recursive until the base case is not satisfied

            result.removeLast();

        }
        subset.addAll(sumOfSubstIsK(arr, result, target, index+1));
        return subset;
    }
}
