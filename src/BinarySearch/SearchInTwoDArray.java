package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchInTwoDArray {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));
        boolean result = searchMatrix(matrix, 9);
        System.out.println(result ? "true" : "false");

    }
    public static boolean searchMatrix(ArrayList<ArrayList<Integer>> matrix, int target) {
        int m = matrix.size();
        if (m == 0) return false;
        int n = matrix.get(0).size();

        //apply binary search:
        int low = 0, high = n * m - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / m, col = mid % m;
            if (matrix.get(row).get(col) == target) return true;
            else if (matrix.get(row).get(col) < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}
