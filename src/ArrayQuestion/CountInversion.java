package ArrayQuestion;

import java.util.ArrayList;

public class CountInversion {
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1};
        int result = countInversion(arr);
        System.out.println(result);
    }


     static int countInversion(int[] arr) {
        int n= arr.length;
        return Solution.mergeSort(arr,0,n-1);

    }
}
class Solution {
    public static int mergeSort(int[] num, int low, int high) {
        int count =0;
        if (low>=high){
            return 0;
        }
        int mid=low+(high-low)/2;
       count+= mergeSort(num,low,mid);
        count+=mergeSort(num,mid+1,high);
        count+=merge(num,low,mid,high);
        return count;
    }

    private static int merge(int[] num, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int count=0;
        int left=low;
        int right=mid+1;
        while (left <= mid && right <= high){
            if (num[left] <= num[right]){
                temp.add(num[left]);
                left++;
            }
            else {
                temp.add(num[right]);
                count += (mid-left+1);
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
        return count;
    }
}
/*
for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]>arr[j])
                    count +=1;
            }
        }
        return count;
 */