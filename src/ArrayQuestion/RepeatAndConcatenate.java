package ArrayQuestion;

public class RepeatAndConcatenate {
    public static void main(String[] args) {
        int[] nums={1,3,2,1};
        int[] result = getConcatenation(nums);
        for (int j : result) {
            System.out.println(j);
        }
    }

    private static int[] getConcatenation(int[] nums) {
            int n= nums.length;
        int[] ans = new int[2* n];//this for storing as per the condition given in the constraints
        for (int i = 0; i < n; i++) {
           ans[i] = nums[i]  ;//1321
           ans[i+ n] = nums[i];//once it's reach the last element it's starts to store the same thing again .
        }

    return ans;
    }
}
