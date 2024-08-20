package ArrayQuestion;

import java.util.Arrays;

public class ShuffleElements {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n=3;
        int[] result= Shuffle(nums,n);
        System.out.println(Arrays.toString(result));
    }

    private static int[] Shuffle(int[] nums, int n) {

        int[] ans = new int[2* n];//this for storing as per the condition given in the constraints
        for (int i = 0; i < n; i++) {
            ans[2*i] = nums[i]  ;//2*i because of storing the first element of the o/p array 2*0=0 and nums[0] =2
            ans[2*i+1]=nums[n+i];//2*i+1 for skipping the elements between these value

        }
        return ans;
    }
}
