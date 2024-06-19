package ArrayQuestion;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int n=6;
        List<List<Integer>> ans = generateRow(n);
        for (List<Integer> i :ans){
            for (int j:i){
                System.out.println(j+" ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> generateRow(int n) {
            List<List<Integer>> ans = new ArrayList<>();
        for (int row = 1; row <= n ; row++) {
                List<Integer> temp = new ArrayList<>();
            for (int col = 1; col <=row ; col++) {
                temp.add(nCr(row-1,col-1));
            }
            ans.add(temp);
        }
        return ans;
    }

    private static Integer nCr(int n, int r) {
        long res=1;
        for (int j = 0; j < r; j++) {
            res = res * (n-j);
            res = res/(j+1);
        }
        return (int)res;
    }
}
