package BinarySearch;

public class MinimumElementInSortedRotatedArray {
    public static void main(String[] args) {
        int[] ar = {5, 6, 7, 8, 1, 2, 3};
        int result = searchElement(ar);
        System.out.println(result);
    }

    private static int searchElement(int[] nums) {
        int target = Integer.MAX_VALUE;
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            //eliminate left sorted part
            if (nums[low] <= nums[mid]) {
                target = Math.min(target, nums[low]);
                low = mid + 1;
            } else {
                high=mid-1;
                target = Math.min(target, nums[mid]);

            }

        }

        return target;
    }
}