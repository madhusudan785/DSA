package ArrayQuestion;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums={7,7,5,7,1,5,7,5,5,7,7,5,5,5,5};
        int element = 0;
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (count==0){
                count=1;
                element=nums[i];
            } else if (nums[i]==element) {
                count++;
            }
            else {
                count--;
            }
        }
        int count1=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==element){
                count1++;
            }
        }
        if (count1>(nums.length)/2)
            System.out.println(element);


    }
}
/*
#Better Approach by HashMap
 int n= nums.length;
        Map<Integer,Integer> map= new HashMap<>();
        for (int num : nums) {
            int val = map.getOrDefault(num, 0);
            map.put(num, val + 1);
        }
        for (Map.Entry<Integer,Integer> it: map.entrySet()){
            if (it.getValue()>(n/2)){
                System.out.println(it.getKey());
            }

        }
#brute force Approach
    for (int num : nums) {
            int count=0;
            for (int i : nums) {
                if (i == num) {
                    count++;
                }
            }
            if (count>nums.length/2){
                System.out.println(num);
            }
            else {
                System.out.println("not found");
            }
        }
 */