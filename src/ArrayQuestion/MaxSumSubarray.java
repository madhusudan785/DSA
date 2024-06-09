package ArrayQuestion;

public class MaxSumSubarray {
    public static void main(String[] args) {
        int[] arr = { -2, -3 ,-1, -5};
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println(maxSum);
    }

    private static long maxSubarraySum(int[] arr, int n) {
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;

        int start = 0;
        int ansStart = -1, ansEnd = -1;
        for (int i = 0; i < n; i++) {

            if (sum == 0) start = i; // starting index

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;

                ansStart = start;
                ansEnd = i;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        //printing the subarray:
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]n");

        // To consider the sum of the empty subarray
        // uncomment the following check:

        if (maxi < 0) maxi = 0;

        return maxi;
    }
}
/*
int current_sum = 0;
        int max_sum = nums[0];
        for(int i = 0; i<nums.length; i++){
            current_sum += nums[i];
            max_sum = current_sum > max_sum ? current_sum : max_sum;
            if(current_sum<0) current_sum = 0;
        }
        return max_sum;
 */

