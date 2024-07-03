package BinarySearch;

public class KthElementInTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,45},arr2={4,6,7,8};
        int k = 7;
        int n1 = arr1.length, n2 = arr2.length;
        int result =findMedianSortedArrays(arr1,arr2,n1,n2,k);
        System.out.println(result);
    }
    public static int findMedianSortedArrays(int[] nums1, int[] nums2, int n1, int n2, int k) {
        //if n1 is bigger swap the arrays:
        if (n1 > n2) return findMedianSortedArrays(nums2, nums1, n1, n2, k);
        int n = n1 + n2; //total length
        int left = k; //length of left half
        //apply binary search:
        int low = Math.max(0,k-n2), high = Math.min(k,n1);
        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = left - mid1;
            //calculate l1, l2, r1 and r2;
            int l1 = (mid1 > 0) ? nums1[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? nums2[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n1) ? nums1[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n2) ? nums2[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 == 1) return Math.max(l1, l2);

            } else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0; //dummy statement

    }
}
