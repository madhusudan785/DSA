package ArrayQuestion;

public class SmallestElement {
    public static void main(String[] args) {
        int[] nums={22,2,34,45,3};
        int smallest=nums[0];
        int s_smallest=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<smallest){
                s_smallest=smallest;
                smallest=nums[i];
            } else if (nums[i]<s_smallest && nums[i]!=smallest) {
                s_smallest=nums[i];
                
            }

        }
        System.out.println(smallest+" "+s_smallest);
    }
}
