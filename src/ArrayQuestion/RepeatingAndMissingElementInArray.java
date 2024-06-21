package ArrayQuestion;

import java.util.Arrays;

public class RepeatingAndMissingElementInArray {
    public static void main(String[] args) {
        int[] nums = {1,1,3,4,5,6};
        int n=6;
        int[] resul=find(nums,n);
        System.out.println(Arrays.toString(resul));
    }

    private static int[] find(int[] nums, int m) {
        int n= nums.length;
        long S=0,S2=0;
        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;
        for (int num : nums) {
            S += num;
            S2 += (long) num * (long)num;
        }
        long val1 = S-SN;//x-y
        long val2=S2 - S2N;

        val2 = val2/val1;//Find X+Y = (X^2-Y^2)/(X-Y):

        long x=(val1+val2)/2;
        long y =x-val1;

        return new int[]{(int) x, (int) y};
    }
}
/*
 int repeating=-1,missing=-1;
        for (int i = 1; i <= n ; i++) {
            int count=0;
            for (int j = 0; j < n; j++) {
                if (nums[j]==i){
                    count++;
                }
                if (count > 1){
                    repeating=i;
                }
                else if (count ==0){
                    missing=i;
                }
                if (repeating != -1 && missing !=-1){
                    break;
                }
            }
        }
 */