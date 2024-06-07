package ArrayQuestion;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonSubarrayKSum {
    public static void main(String[] args) {
        int[] a = {2, 0, 0, 0, 9};
        long k = 9;
        int n = a.length; // size of the array.
        int sum=a[0];// important thing to do initially consider that the first element is the max sum
        int left=0;//this is the pointer
        int right=0;
        int maxLen=0;
        while (right<n){
            while (left<=right && sum>k){
                sum -=a[left];//trim the part that exceeds from k value
                left++;
            }
            if (sum == k){
                maxLen=Math.max(maxLen,right-left+1);
            }
            right++;
            if (right<n){
                sum += a[right];
            }
        }
        System.out.println(maxLen);

        }


    }

//Map<Long, Integer> preSumMap = new HashMap<>();
//        long sum = 0;
//        int maxLen = 0;
//        for (int i = 0; i < n; i++) {
//            //calculate the prefix sum till index i:
//            sum += a[i];
//
//            // if the sum = k, update the maxLen:
//            if (sum == k) {
//                maxLen = Math.max(maxLen, i + 1);
//            }
//
//            // calculate the sum of remaining part i.e. x-k:
//            long rem = sum - k;
//
//            //Calculate the length and update maxLen:
//            if (preSumMap.containsKey(rem)) {
//                int len = i - preSumMap.get(rem);
//                maxLen = Math.max(maxLen, len);
//            }
//
//            //Finally, update the map checking the conditions: this is both for +ve sub array and also for negative subarray
//            if (!preSumMap.containsKey(sum)) {
//                preSumMap.put(sum, i);
//            }