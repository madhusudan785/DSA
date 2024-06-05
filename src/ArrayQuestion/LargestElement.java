package ArrayQuestion;

public class LargestElement {
    public static void main(String[] args) {
        int[] nums = {6, 2, 1, 5, 8,9,1000};
//optimal solution with time complexity O(n)
        int largest=nums[0];
        int s_largest=-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>largest){
                s_largest=largest;
                largest=nums[i];
            } else if (nums[i] < largest && nums[i] > s_largest) {
                s_largest=nums[i];
                
            }

        }
        System.out.println(largest + " "+ s_largest);
/*
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println(max);
        //second largest element
        int s_largest=-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>s_largest && nums[i]!=max){
                s_largest=nums[i];


            }

        }
        System.out.println(s_largest);

*/
    }
}
