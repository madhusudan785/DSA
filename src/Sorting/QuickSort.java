package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={4,6,2,5,7,9,1,3};
        System.out.println(Arrays.toString(arr));
        int n= arr.length;
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));

    }
    private static void quickSort(int[] arr, int low, int high) {
        if (low<high){
            int partitionIndex=partition(arr, low, high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot=arr[low];
        int i=low;
        int j=high;
        while (i<j){
            while (arr[i]<=pivot && i<=high-1){
                i++;
            }
            while (arr[j]>pivot && j>=low+1){
                j--;
            }
            if (i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;

    }
}

