package ArrayQuestion;

import java.util.*;

public class ThreeSumProblem {
    public static void main(String[] args) {
        int[] arr={-1, 0, 1, 2, -1, -4};

        List<List<Integer>>ans= threeSum(arr);
        System.out.println(ans);



    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n= nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i>0 && nums[i] == nums[i-1])
                continue;
            int j=i+1 , k=n-1;
            while (j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if (sum<0){
                    j++;
                } else if (sum>0) {
                    k--;
                }
                else {
                    List<Integer> temp =Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;

                }
            }
        }


        return ans;
    }
}
/*
better sol with t.c-> nearly about n^2*logm. and s.c->O(n)+O(nLogm)
  for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
               int third = -(arr[i]+arr[j]);
                    if (set.contains(third)) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j],third);
                        temp.sort(null);
                        st.add(temp);
                    }
                    set.add(arr[j]);
                }
        }
        ////////////////////////////**********************************--------------------------
brute force time more consuming did not pass the test case
Set<List<Integer>> st = new HashSet<>();
int n= arr.length;
// check all possible triplets:
        for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
        for (int k = j + 1; k < n; k++) {
        if (arr[i] + arr[j] + arr[k] == 0) {
List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        temp.sort(null);
                        st.add(temp);
                    }
                            }
                            }
                            }

// store the set elements in the answer:
List<List<Integer>> ans = new ArrayList<>(st);

 */