package ArrayQuestion;

import java.util.HashSet;

public class MissingElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5};
        int n=5;
        int xor1=0;
        int xor2=0;
        for (int i = 0; i < n-1; i++) {
            xor2 = xor1 ^nums[i];
            xor1=xor1^(i+1);
        }
        xor1 = xor1 ^ n;

        System.out.println(xor1^xor2);


    }}
     /*   int[] hash = new int[nums.length+1];
       int result = 0;
        for (int i = 0; i < nums.length-1 ; i++) {
            hash[nums[i]]++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (hash[i]==0)
                result=i;
        }
        System.out.println(result);
*/

