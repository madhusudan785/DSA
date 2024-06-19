package ArrayQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumProblem {//target varies

    public static void main(String[] args) {
        int[] arr={1000000000,1000000000,1000000000,1000000000};
        int target=-294967296;
        List<List<Integer>>ans= threeSum(arr,target);
        System.out.println(ans);
    }

    public static List<List<Integer>> threeSum(int[] nums, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        int n= nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i>0 && nums[i] == nums[i-1])
                continue;
            for (int j = i+1; j <n ; j++) {
                if (j != i+1 && nums[j] == nums[j-1])
                    continue;
                int k=j+1 , l=n-1;

                while (k<l){
                    long sum=nums[i];
                    sum +=nums[j];
                    sum += nums[k];
                    sum +=nums[l];

                    if (target==sum){
                        List<Integer> temp =Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        answer.add(temp);
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1]) k++;
                        while (k < l && nums[l] == nums[l + 1]) l--;
                    } else if (sum<target) {
                        k++;
                    }
                    else {
                        l--;

                    }
                }
            }
        }


        return answer;
    }
}