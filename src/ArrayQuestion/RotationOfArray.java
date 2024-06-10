package ArrayQuestion;

import java.util.Arrays;

public class RotationOfArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;//k%n for the value of k is grater than the n value
        int[] temp = new int[k];
        System.arraycopy(nums, 0, temp, 0, k);
        int n=nums.length;
        for (int i = k; i < n ; i++) {
            nums[i-k]=nums[i];   //this is for shifting of remaining element
        }

        //next thing to is to put the elements that are stored in the temp[]

        for (int i = n-k; i <n ; i++) {
            nums[i]=temp[i-(n-k)];

        }
        System.out.println(Arrays.toString(nums));

        //for one place
       /* int[] nums={1,2,3,4,5};
        int temp=nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i-1]=nums[i];

        }
        nums[nums.length-1]=temp;
        System.out.println(Arrays.toString(nums));*/
    }


}
