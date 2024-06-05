package ArrayQuestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {

        int[] nums={1,1,2,2,2,3,3};
       int[] result=duplicate(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] duplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int[] result=new int[set.size()];
        int index=0;

        for (int num:set) {
            result[index++]=num;
        }
        return result;
    }
}
