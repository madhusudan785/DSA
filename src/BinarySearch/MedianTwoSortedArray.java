package BinarySearch;

public class MedianTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {},arr2={1};
        double result =findMedianSortedArrays(arr1,arr2);
        System.out.println(result);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        //if n1 is bigger swap the arrays:
        if (n1 > n2) return findMedianSortedArrays(nums2, nums1);
        int n = n1 + n2; //total length
        int left = (n1 + n2 + 1) / 2; //length of left half
        //apply binary search:
        int low = 0, high = n1;
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
                else return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            } else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0; //dummy statement

    }
}
/*
optimal
 int n1 = nums1.length;
        int n2 = nums2.length;
        int n=n1+n2;
        int count=0;
        int ind2=n1/2,ind1=ind2-1;
        int index1=-1,index2=-1;
        int i=0, j=0;
        while(i<n1 && j<n2){
            if (nums1[i]<nums2[j]) {
                if(count==ind1) index1=nums1[i];
                if(count==ind2) index2=nums2[i];
                count++;
                i++;
            }
            else {
                if(count==ind1) index1=nums1[j];
                if(count==ind2) index2=nums2[j];
                count++;
                j++;
            }
        }
        //for any left elements
        while (i<n1){
            if(count==ind1) index1=nums1[i];
            if(count==ind2) index2=nums2[i];
            count++;
            i++;
        }
        while (j<n2){
            if(count==ind1) index2=nums1[j];
            if(count==ind2) index1=nums2[j];
            count++;
            j++;
        }
        if (n%2 == 1) {
            return (double) index2;
        }
        return (double)(index1+index2)/2.0;
brute force
 while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                arr3.add(nums1[i++]);
            }
            else {
                arr3.add(nums2[j++]);
            }
        }
        while(i<n){
            arr3.add(nums1[i++]);
        }
        while(j<m){
            arr3.add(nums2[j++]);
        }
        int n1=(n+m);
        if(n1%2==1) {
            return arr3.get(n1/ 2);
        }
            double median = ((double) arr3.get(n1/ 2) + (double) arr3.get((n1 / 2) - 1)) / 2.0;
            return median;
 */
