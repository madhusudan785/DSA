package ArrayQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeElement {
    public static void main(String[] args) {//this solution is only for when we know no. of +ve == -ve 
        int[] nums={-1,1};
        int n=nums.length;
//        List<Integer> list=new ArrayList<>();
        int[] ans=new int[n];
        int  positive=0,negative=1;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                ans[negative]=nums[i];
                negative +=2;
            }
            else{
                ans[positive]=nums[i];
                positive +=2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
