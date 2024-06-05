package ArrayQuestion;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] nums={1};

        int j=-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }

        }
        if (j==-1){
            System.out.println(Arrays.toString(nums));
        }
        else {
            for (int i = j + 1; i < nums.length; i++) {
                if (nums[i] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j++;
                }

            }
        }



        System.out.println(Arrays.toString(nums));

 /*       ArrayList<Integer> temp = new ArrayList<>();
        for (int j : nums) {
            if (j != 0) {
                temp.add(j);
            }
        }
        for (int i = 0; i < temp.size(); i++) {
            nums[i]= temp.get(i);
        }
        int nonZero= temp.size();

        for (int i = nonZero; i < nums.length ; i++) {
            nums[i]=0;

        }*/

    }
}
