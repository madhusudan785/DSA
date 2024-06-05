package ArrayQuestion;

import java.util.Arrays;

/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
Example 1:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */
public class Leetcode1480 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] result = runningSum(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] runningSum(int[] nums) {
        int[] result= new int[nums.length];
        result[0]=nums[0];//this is the initial value result[0]=nums[0]=1
        for (int i = 1; i < nums.length; i++) {
           result[i] =result[i-1]+nums[i];//result[i-1] for preventing array index out of bound or the overflow condition
        }


        return result;
    }
}
