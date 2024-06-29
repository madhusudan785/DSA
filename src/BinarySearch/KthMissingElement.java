package BinarySearch;

public class KthMissingElement {
    public static void main(String[] args) {
        int[] arr = {3,4,7,11};
        int k = 1;
        int result=findKthPositive(arr,k);
        System.out.println("The kth positive is "+result);
    }
    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k){
                low=mid+1;
            }
            else {
                high=mid-1;
            }

        }
        return low+k;
    }



}
