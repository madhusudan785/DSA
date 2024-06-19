package ArrayQuestion;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementForoneThird {
    public static void main(String[] args) {
        int[] arr = {1,2};

        List<Integer> ans = majorelement(arr);
        System.out.println(ans);
    }

    private static List<Integer> majorelement(int[] nums) {
        int n = nums.length;

        int count1 = 0, count2 = 0;
        int element1 = Integer.MIN_VALUE, element2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (count1 == 0 && nums[i] != element2 ){
                count1=1;
                element1=nums[i];
            } else if (count2==0 && nums[i] != element1 ) {
                count2=1;
                element2=nums[i];
            } else if (element1== nums[i]) {
                count1++;
            } else if (element2 == nums[i]) {
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        List<Integer> ls = new ArrayList<>(); // list of answers

        // Manually check if the stored elements in
        // el1 and el2 are the majority elements:
        count1 = 0; count2 = 0;
        for (int j : nums) {
            if (j == element1) count1++;
            if (j == element2) count2++;
        }

        int mini = (int)(n / 3) + 1;
        if (count1 >= mini) ls.add(element1);
        if (count2 >= mini) ls.add(element2);
        // if it is told to sort the answer array:
        //Collections.sort(ls); //TC --> O(2*log2) ~ O(1);

        return ls;
    }
}
