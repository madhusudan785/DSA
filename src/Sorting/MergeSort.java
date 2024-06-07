package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
      int[] num={3,4,2,1,5};
        System.out.println(Arrays.toString(num));
      int n= num.length;
      Solution.mergeSort(num,0,n-1);
        for (int j : num) {
            System.out.println(j);
        }

    }
}
class Solution {
    public static void mergeSort(int[] num, int low, int high) {
        if (low>=high){
            return;
        }
        int mid=(high+low)/2;
        mergeSort(num,low,mid);
        mergeSort(num,mid+1,high);
        merge(num,low,mid,high);
    }

    private static void merge(int[] num, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left=low;
        int right=mid+1;
        while (left <= mid && right <= high){
            if (num[left] <= num[right]){
                temp.add(num[left]);
                left++;
            }
            else {
                temp.add(num[right]);
                right++;
            }
        }
        while (left <= mid){
            temp.add(num[left]);
            left++;
        }
        while (right<=high){
            temp.add(num[right] );
            right++;
        }
        for (int i = low; i <= high ; i++) {
            num[i]=temp.get(i-low);
        }
    }
}
