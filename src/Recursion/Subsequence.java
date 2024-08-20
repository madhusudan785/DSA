package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    public static void main(String[] args) {
        int[] arr={3,1,2};
        List<Integer> result=new ArrayList<>();
        int index=0;
        List<List<Integer>> subsets = subsets(index, result, arr);
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
    public static List<List<Integer>> subsets(int index, List<Integer> list,int[] nums) {
        List<List<Integer>> allSubsets = new ArrayList<>();

        if (index >= nums.length) {
            allSubsets.add(new ArrayList<>(list)); // Add the current subset to the list
            return allSubsets;
        }

        // Include the current element in the subset
        list.add(nums[index]);
        allSubsets.addAll(subsets(index + 1, list, nums));

        // Exclude the current element from the subset
        list.removeLast();
        allSubsets.addAll(subsets(index + 1, list, nums));

        return allSubsets;
    }
}
