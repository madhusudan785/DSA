package ArrayQuestion;

import java.util.Scanner;

public class MatrixSetZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get matrix dimensions from user
        System.out.print("Enter number of rows: ");
        int n = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int m = scanner.nextInt();

        // Create the matrix
        int[][] matrix = new int[n][m];

        // Get matrix values from user
        System.out.println("Enter matrix values row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int value = scanner.nextInt();
                if (value == 0 || value == 1) {
                    matrix[i][j] = value;
                } else {
                    System.out.println("Enter Only 1/0");
                    j--;
                }
            }
        }
        int col0=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j]==0){
                    matrix[i][0]=0;
                    if (j !=0) {
                        matrix[0][j] = 0;
                    }
                    else {
                        col0=0;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] !=0){
                    if (matrix[0][j] == 0 || matrix[i][0] == 0){
                        matrix[i][j]=0;
                    }
                }
            }
        }

        if(matrix[0][0] ==0){
            for (int j = 0; j < m; j++) {
                matrix[0][j]=0;
            }

        }
        if (col0 ==0){
            for (int i = 0; i < n; i++) {
                matrix[i][0]=0;
            }
        }

        System.out.println("Resulting matrix is");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(matrix[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println();

    }
}
/*
better approach t.c-> O(n^2) , s.c -> O(n)
  boolean[] row =new boolean[n];
        boolean[] column =new boolean[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j]==0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i]|| column[j]){
                    matrix[i][j]=0;
                }
            }
        }
brute force approach where the t.c->O(n^3), s.c -> O(1)
zeroMatrix(matrix,n,m);
    private static void zeroMatrix(int[][] matrix, int n, int m) {
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
            if (matrix[i][j] == 0){
                markRow(matrix, n, m, i);
                markColumn(matrix, n, m, j);
            }
        }
        }

        for (int i = 0; i < n; i++) {
            for (int j=0;j<m;j++){
                if (matrix[i][j] == -1){
                    matrix[i][j] =0;
                }
            }
        }
    }

    private static void markColumn(int[][] matrix, int n, int m, int j) {
        for (int i = 0; i < n; i++) {
            if (matrix[i][j] != 0){
                matrix[i][j]=-1;
            }
        }
    }

    private static void markRow(int[][] matrix, int n, int m, int i) {
        for (int j=0;j<m;j++){
            if (matrix[i][j] !=0){
                matrix[i][j]=-1;
            }
        }
    }


}
*/