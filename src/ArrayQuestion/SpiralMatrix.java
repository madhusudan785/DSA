package ArrayQuestion;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        List<Integer> result = spiral(arr);
        System.out.println(result);
    }

    private static List<Integer> spiral(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0, right = m - 1;
        int top = 0, btm = n - 1;
        List<Integer> ls = new ArrayList<>();
        while (top <= btm && left <= right) {
            for (int i = left; i <= right; i++) {
                ls.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= btm; i++) {
                ls.add(matrix[i][right]);
            }
            right--;
            if (top <= btm){
                for (int i = right; i >= left; i--) {
                    ls.add(matrix[btm][i]);
                }
            btm--;
            }

            if (left<= right) {
                for (int i = btm; i >= top; i--) {
                    ls.add(matrix[i][left]);
                }
                left++;
            }

        }
        return ls;
    }
}