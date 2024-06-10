package ArrayQuestion;

import java.util.ArrayList;
import java.util.List;

public class LeaderInArray {
    public static void main(String[] args) {
        int[] nums={10,22,3,12,0,6};

        List<Integer> result=leaderInArray(nums);
        System.out.println(result);
    }

    private static List<Integer> leaderInArray(int[] nums) {
        int n= nums.length;
        List<Integer> result=new ArrayList<>();
        int max=Integer.MIN_VALUE;   //we can also insert the last(n-1)th index
        for (int i = n-1; i >0; i--) {
            if (nums[i]>max){
                result.add(nums[i]);
                //keep tracking of max value
                max=Math.max(max,nums[i]);            }

        }
        return result;
    }
}
