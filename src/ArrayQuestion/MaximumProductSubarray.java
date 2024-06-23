package ArrayQuestion;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] nums={0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};//1000000000...
        long result = maxProduct(nums);
        System.out.println(result);
    }

    private static long maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                // Swap maxProduct and minProduct when nums[i] is negative
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            result = Math.max(result, maxProduct);
        }

        return result;
    }
//        int n= nums.length;
//        long prefix =1,suffix =1;
//        long ans=Long.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            if (prefix == 0) prefix=1;
//            if (suffix == 0) suffix=1;
//            prefix *=nums[i];
//            suffix *=nums[n-i-1];
//
//            ans=Math.max(ans,Math.max(prefix,suffix));
//
//        }
//        return ans;
//    }
}
/*
 if (nums == null || nums.length == 0) {
            return 0;
        }

int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                // Swap maxProduct and minProduct when nums[i] is negative
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            result = Math.max(result, maxProduct);
        }

        return result;
 */