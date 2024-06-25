package BinarySearch;

public class SearchElementForDuplicateValues {
    public static void main(String[] args) {
        int[] ar={1,0,1,1,1};
        int target=0;
        boolean result=searchElement(ar,target);
        System.out.println(result);
    }

    private static boolean searchElement(int[] nums, int target) {
        int n= nums.length;
        int low=0;
        int high=n-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (nums[mid] ==target) return true;
            //eliminate duplicates
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low=low+1;
                high=high-1;
                continue;
            }
            // check left sorted part
            if (nums[low]<=nums[mid]) {
                if (nums[low] <= target && target <= nums[mid]) {
                    high=mid-1;
                }
                else {
                    low=mid+1;
                }
            }
            //check right sorted part
            else {
                if (nums[mid] <= target && target <= nums[high]){
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }

            }

        }
        return false;
    }
}


