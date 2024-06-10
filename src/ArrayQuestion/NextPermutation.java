package ArrayQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums={2,1,5,3,4,0,0};
        System.out.println(Arrays.toString(nums));
        int n= nums.length;
        int index=-1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // If no break point is found, reverse the whole array
        if (index == -1) {
            reverse(nums, 0, n - 1);
            System.out.println(Arrays.toString(nums));
        }

        // Find the next greater element to swap with
        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }
        //Reverse the right part
        reverse(nums, index + 1, n - 1);
        System.out.println("Next Permutation is "+Arrays.toString(nums));


    }

    // Helper method to reverse a part of the array in place
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    // Helper method to swap two elements in the array
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
