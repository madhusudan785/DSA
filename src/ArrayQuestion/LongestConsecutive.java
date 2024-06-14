package ArrayQuestion;

import java.util.Arrays;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums={102,4,100,101,3,2,1};
        int n= nums.length;
        int longest=1;
        int count=0;
        Arrays.sort(nums);
        int lastSmallest=Integer.MIN_VALUE;
        for (int num : nums) {

            if (num - 1 == lastSmallest) { // to allocate the first index of the array as the lastSmallest element
                lastSmallest = num;
                count += 1;
            } else if (num != lastSmallest) {
                count = 1;
                lastSmallest = num;
            }
            longest = Math.max(longest, count);
        }
        System.out.println(longest);

    }
}
