package BinarySearch;

import java.util.Arrays;

public class CountDuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,8,8,8,17,19};
        int n= arr.length;
        int target=8;
        int result = count(arr,n,target);

        System.out.println("The target count is : " +result);
    }

    private static int count(int[] arr, int n, int target) {
        int[] result =search(arr,n,target);
        if (result[0]==-1) return 0;
        return (result[1]-result[0] +1);//lastIndex -firstIndex +1 form search return;
     }

    private static int[] search(int[] nums, int n, int target) {
        int first= firstOccurrence(nums,target,n);
        int last=lastOccurrence(nums,target,n);
        if (first == -1 && last == -1) return new int[]{-1,-1};
        else return new int[]{first,last};
    }

    private static int lastOccurrence(int[] nums, int target, int n) {
        int low=0;
        int high=n-1;
        int last=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid] == target){
                last=mid;
                low=mid+1;
            }
            else if(nums[mid] < target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return last;
    }

    private static int firstOccurrence(int[] nums, int target, int n) {
        int low=0;
        int high=n-1;
        int first=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid] == target){
                first=mid;
                high=mid-1;
            }
            else if(nums[mid] < target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return first;
    }
}
