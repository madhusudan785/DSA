package ArrayQuestion;

import java.util.Arrays;

public class Leetcode1929 {
    public static void main(String[] args) {
        int[] nums={1,3,2,1};
        int[] result = getConcatenation(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }
    }

    private static int[] getConcatenation(int[] nums) {

        int[] ans = new int[2* nums.length];//this for storing as per the condition given in the constraints
        for (int i = 0; i < nums.length; i++) {
           ans[i] = nums[i]  ;//1321
           ans[i+ nums.length] = nums[i];//once it's reach the last element it's starts to store the same thing again .
        }

    return ans;
    }
}
