package ArrayQuestion;

import java.util.Arrays;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] a={2,6,5,8,5,9};
        int target =14;
        int[] nums=twoSum(a,target);
        if (Arrays.equals(nums, a)){
            System.out.println("not found");
        }
        else {
            System.out.println(Arrays.toString(nums));
        }
    }

    private static int[] twoSum(int[] a, int target) {
        Arrays.sort(a);
        int left =0;
        int right=a.length-1;

        while (left<right){
           int sum=a[left]+a[right];
            if (sum==target){
                return new int[]{left,right};
            } else if (sum<target) {
                left++;

            }
            else {
                right--;
            }
        }
        return a;
    }
}
//brute force approach
/*
for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]+a[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return a;
 */
