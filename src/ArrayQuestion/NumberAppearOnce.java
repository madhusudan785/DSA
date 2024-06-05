package ArrayQuestion;

public class NumberAppearOnce {
    public static void main(String[] args) {
        int[] nums={1,1,2,3,3,4,4};
        int xor1=0;


        for (int num : nums) {
            xor1 = xor1 ^ num;

        }
        System.out.println(xor1);

    }
}
