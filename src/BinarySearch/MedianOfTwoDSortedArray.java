package BinarySearch;

import java.awt.*;
import java.util.*;
import java.util.List;
public class MedianOfTwoDSortedArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 5, 7, 9, 11}, {2, 3, 4, 5, 10}, {9, 10, 12, 14, 16}};
        int n = arr.length;
        int m = arr[0].length;
        int res = medianElement(arr, n, m);
        System.out.println(res);
    }

    public static int medianElement(int[][] matrix, int n, int m) {
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;

        // Initialize low and high with the min and max elements of the matrix
        for (int i = 0; i < n; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][m - 1]);
        }

        int req = (n * m) / 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            int smallerEquals = countSmallEqual(matrix, mid, n, m);
            if (smallerEquals <= req) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private static int countSmallEqual(int[][] matrix, int mid, int n, int m) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += func(matrix[i], mid, m);
        }
        return count;
    }

    public static int func(int[] row, int mid, int n) {
        return UpperBound.search(row, n, mid);
    }
}

/*
List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                list.add(arr[i][j]);
            }
        }
        Collections.sort(list);
        return list.get((n*m)/2);
 */