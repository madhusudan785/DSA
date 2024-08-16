package Recursion;

import java.util.Arrays;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] arr={12,33,432,2,1};
        int l=0;
        int r= arr.length-1;
        int[] result=rotate(l,arr);
        System.out.println(Arrays.toString(result));
    }
    private static int[] rotate(int i,int[] arr){
        int n= arr.length;
        if (i>=n/2)
            return arr;

        swap(arr,i,n-i-1);

        return rotate(i+1,arr);
    }

    private static int[] rotate(int[] arr,int l, int r) {
        if(l>=r)
            return arr ;
        swap(arr,l,r);

        return  rotate(arr,l + 1, r - 1);
    }

    private static void swap(int[] arr,int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
