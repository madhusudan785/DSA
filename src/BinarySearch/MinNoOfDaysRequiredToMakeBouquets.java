package BinarySearch;

public class MinNoOfDaysRequiredToMakeBouquets {
    public static void main(String[] args) {
        int[] arr={7,7,7,7,12,7,7};
        int m=2,k=3;
        int result=minDays(arr,m,k);
        System.out.println(result);
    }

    private static int minDays(int[] bloomDay, int m, int k) {
        int n= bloomDay.length;
        long val= (long) m *k;

        if (n<val) return -1;

        int mini=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for (int i : bloomDay) {
            mini = Math.min(mini, i);
            max = Math.max(max, i);
        }
        int low=mini,high=max;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (possible(bloomDay,mid,k,m)){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return low;
    }

    private static boolean possible(int[] bloomDay, int day, int k, int m) {

        int cnt = 0;
        int noOfB = 0;
        for (int j : bloomDay) {
            if (j <= day) {
                cnt++;
            } else {
                noOfB += (cnt / k);
                cnt = 0;
            }
        }
        noOfB += (cnt / k);
        return noOfB >= m;

    }

}
