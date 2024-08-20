package ArrayQuestion;

public class RichestCustomer {
    public static void main(String[] args) {
        int[][] nums= {{1,5},{7,3},{3,5}};
        int result = maximumWealth(nums);
        System.out.println(result);

    }

    private static int maximumWealth(int[][] nums) {
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            int current=0;
            for (int j =0;j< nums[i].length;j++){//here the condition j<nums[i].length is for row wise addition 1+5 for n[i=0]
                current +=nums[i][j];
            }
            if (current>max){
                max=current;
            }

        }
        return max;

    }
}
