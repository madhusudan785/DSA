package ArrayQuestion;

import java.util.Arrays;

public class RightRotation {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] result = rotate(nums,k);
        System.out.println(Arrays.toString(nums));  // Output: [5, 6, 7, 1, 2, 3, 4]
    }

        public static int[] rotate(int[] nums, int k) {
            int n = nums.length;
            k = k % n;  // In case k is greater than the length of the array

            if (k == 0) return nums;

            int[] temp = new int[k];
            // Store the last k elements in temp
            for (int i = 0; i < k; i++) {
                temp[i] = nums[n - k + i];
            }

            // Shift the remaining elements to the right
            for (int i = n - 1; i >= k; i--) {
                nums[i] = nums[i - k];
            }

            // Place the elements from temp into the beginning of nums
            for (int i = 0; i < k; i++) {
                nums[i] = temp[i];
            }

            // Output the result (for testing)
            System.out.println(Arrays.toString(nums));
            return nums;
        }
    }
    
