package ArrayQuestion;

import java.util.ArrayList;

public class ReversePair {
    public static void main(String[] args) {
        int[] arr = {-5,-5};
        int result = countInversion(arr);
        System.out.println(result);
    }

    public static int countInversion(int[] arr) {
        return Solution1.mergeSort(arr,0,arr.length-1);
    }
}
class Solution1 {
    public static int mergeSort(int[] num, int low, int high) {
        int count = 0;
        if (low >= high) {
            return count;
        }
        int mid = (high + low) / 2;
        count += mergeSort(num, low, mid);  // left half
        count += mergeSort(num, mid + 1, high); // right half
        count += countPairs(num, low, mid, high); //Modification
        merge(num, low, mid, high);
        return count;
    }

    private static int countPairs(int[] num, int low, int mid, int high) {
        int right = mid + 1;
        int cnt = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && num[i] > (long)2 * num[right]) right++;
            cnt += right - (mid + 1);
        }
        return cnt;
    }

    private static void merge(int[] num, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int count = 0;
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (num[left] <= num[right]) {
                temp.add(num[left]);
                left++;
            } else {
                temp.add(num[right]);
                count += (mid - left + 1);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(num[left]);
            left++;
        }
        while (right <= high) {
            temp.add(num[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            num[i] = temp.get(i - low);
        }
    }
}
