package BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {2,12,15,16,17,19};
        int n= arr.length;
        int target=1;
        int result = search(arr,n,target);

            System.out.println("The target is at index: " + result);
    }

    private static int search(int[] nums, int n, int target) {
        int low =0;
        int high = n-1;
        int ans=n;
        while (low<=high){
            int mid = (low + high)/2;
            if(nums[mid]>=target){//nums[mid]>target this is the condition for the upper bound
                 ans=mid;
                 high=mid-1;
            }
            else {
               low=mid+1;
            }
        }
        return ans;

    }
    }

