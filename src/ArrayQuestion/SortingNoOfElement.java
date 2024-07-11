package ArrayQuestion;

import java.util.Arrays;

public class SortingNoOfElement {
    public static void main(String[] args) {
        int[] nums={0, 0, 1, 2, 1, 0};
        int n= nums.length;
        int low=0;
        int high=n-1;
        int mid=0;
       while (mid<=high){
            if (nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
            } else if (nums[mid]==1) {
                mid++;
            }
            else {
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }

       }

        System.out.println(Arrays.toString(nums));
//        System.out.println(count0+" "+count1+" "+count2);
    }
}
/*
int count0=0;
        int count1=0;
        int count2=0;
        for (int i:nums){
            if (i==0){
                count0++;
            } else if (i==1) {
                count1++;
            }
            else {
                count2++;
            }
        }

        for (int i=0;i<=count0;i++){
            nums[i]=0;
        }
        for (int i=count0;i<=count0+count1;i++){
            nums[i]=1;
        }
        for (int i=count1+count0;i< nums.length;i++){
            nums[i]=2;
        }
 */
