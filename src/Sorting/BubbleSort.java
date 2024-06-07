package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums={6,5,4,3,2,1};
        System.out.println(Arrays.toString(nums));
        int n=nums.length;
        for (int i = n-1; i >=1 ; i--) {//here find max, so  we do not go to the first element hence i>=1.
            int didSwap=0;
            for (int j = 0; j < n-1; j++) {
                if (nums[j]>nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                    didSwap=1;
                }
                if (didSwap==0)
                    break;

            }


        }
        System.out.println("After Sorting"+ Arrays.toString(nums));
    }
}
