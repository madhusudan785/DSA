package BinarySearch;

public class SearchElementInAnSortedArray {
    public static void main(String[] args) {
        int[] ar={5,1,3};
        int target=3;
        int result=searchElement(ar,target);
        System.out.println(result);
    }

    private static int searchElement(int[] nums, int target) {
        int n= nums.length;
        int low=0;
        int high=n-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (nums[mid] ==target) return mid;
            //eliminate left sorted part
            if (nums[low]<=nums[mid]) {
                if (nums[low] <= target && target <= nums[mid]) {
                    high=mid-1;
                }
                else {
                    low=mid+1;
                }
            }
            //eliminate right sorted part
            else {
                if (nums[mid] <= target && target <= nums[high]){
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }

            }

        }
        return -1;
    }
}
