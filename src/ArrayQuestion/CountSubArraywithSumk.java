package ArrayQuestion;

import java.util.HashMap;
import java.util.Map;

public class CountSubArraywithSumk {
    public static void main(String[] args) {
        int[] nums={3,-3,1,1,1};
        int k =3;
        int result=subarray(nums,k);
        System.out.println(result);
    }

    private static int subarray(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int preSum=0; int count =0;
         map.put(0,1);
        for (int i = 0; i < nums.length; i++) {

            preSum += nums[i];

            int remove = preSum -k;

            count += map.getOrDefault(remove,0);

            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }

        return count;
    }
}
/*
 int sum = 0,count=0;
        for(int i =0;i<nums.length;i++){
            sum = nums[i];
            if(sum==k) count++;
            for(int j = i+1;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k) count++;
            }
        }
        System.gc();
        return count;
 */
