package ArrayQuestion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2, 5, 6};
        int n = 3, m = 3;
        merge(arr1, arr2, n, m);
        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\narr2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

    }

    public static void merge(int[] nums1, int[] nums2, int n,int m) {

        int left = n-1;
        int right = 0;
        while (left >=0 && right<m){
            if (nums1[left] > nums2[right]){
                long temp=nums1[left];
                nums1[left]=nums2[right];
                nums2[right] = (int) temp;
                left--;
                right++;
            }
            else {
                break;
            }
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);

    }
}
/*
// Declare a 3rd array and 2 pointers:
        long[] arr3 = new long[n + m];
          // Insert the elements from the 2 arrays
        // into the 3rd array using left and right
        // pointers:

        while (left < n && right < m) {
            if (nums1[left] <= nums2[right]) {
                arr3[index] = nums1[left];
                left++;
                index++;
            } else {
                arr3[index] = nums2[right];
                right++;
                index++;
            }
        }

        // If right pointer reaches the end:
        while (left < n) {
            arr3[index++] = nums1[left++];
        }

        // If left pointer reaches the end:
        while (right < m) {
            arr3[index++] = nums2[right++];
        }

        // Fill back the elements from arr3[]
        // to arr1[] and arr2[]:
        for (int i = 0; i < n + m; i++) {
            if (i < n) {
                nums1[i] = (int) arr3[i];
            } else {
                nums2[i - n] = (int) arr3[i];
            }

        }
 */

