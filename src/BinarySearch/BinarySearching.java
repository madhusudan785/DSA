package BinarySearch;

public class BinarySearching {
    public static void main(String[] args) {
        int[] arr = {2,3,6,10,12,15,17,19};
        int n= arr.length;
        int target=17;
        int result = search(arr,n,target);
        if (result == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + result);
    }

    private static int search(int[] nums, int n, int target) {
        int low =0;
        int high = n-1;
        while (low<=high){
            int mid = (low + high)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]<target) {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return -1;

    }
}
