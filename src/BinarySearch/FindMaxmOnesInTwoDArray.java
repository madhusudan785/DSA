package BinarySearch;

public class FindMaxmOnesInTwoDArray {
    public static void main(String[] args) {
        int[][] arr = {{0,0,1,1,1},{0,0,0,0,0},{0,1,1,1,1},{0,0,0,0,0},{0,1,1,1,1}};
        int n=5,m=5;
        int result=find(arr,n,m);
        System.out.println(result);
    }

    private static int find(int[][] arr, int n, int m) {
        int max_count=0;
        int index=-1;
        for(int i=0;i<n;i++){
            int count_ones=m-firstOccurrence(arr[i], m, 1);
            if(count_ones > max_count){
                max_count=count_ones;
                index=i;
            }
        }
        return index;
    }
    private static int firstOccurrence(int[] nums, int n, int target) {
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
/*
brute force. T.C->O(n*m),S.C->O(1)
for(int i=0;i<arr.length-1;i++){
            int count=0;
            for(int j=0;j< arr.length-1;j++){
                count+=arr[j][i];
            }
            if(count>max_count){
                max_count=count;
                index=i;
            }
        }
 */
