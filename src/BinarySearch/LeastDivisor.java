package BinarySearch;

public class LeastDivisor {
    public static void main(String[] args) {
        int[] arr = {1,2,5,9};
        int threshold=6;
        int result=findLeast(arr,threshold);
        System.out.println(result);
    }

    private static int findLeast(int[] nums, int threshold) {
        int n=nums.length;
        if(n>threshold) return -1;
        int low=1,high=Integer.MIN_VALUE;
        for(int i:nums){
            high=Math.max(high,i);
        }
        while(low <= high){
            int mid=low+(high-low)/2;
            if(subDiv(nums,mid) <= threshold){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;

    }
    public static int subDiv(int[] nums, int mid){
        int result=0;
        for(int i:nums){
            result += Math.ceil((double)i/(double)mid );
        }
        return result;
    }
}
