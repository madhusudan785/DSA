package BinarySearch;

public class ShippingLoadWihtinDdays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int days=5;
        int result=shipWithinDays(arr,days);
        System.out.println(result);
    }
    public static int shipWithinDays(int[] weights, int days) {

        int low = Integer.MIN_VALUE, high = 0;
        for (int weight : weights) {
            high += weight;
            low = Math.max(low, weight);
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            int numberOfDays = daysReq(weights, mid);
            if (numberOfDays <= days) {
                //eliminate right half
                high = mid - 1;
            } else {
                //eliminate left half
                low = mid + 1;
            }
        }
        return low;
    }
    public static int daysReq(int[] nums,int capacity){
        int days=1;
        int load =0;
        for(int i :nums){
            if(load+i > capacity){
                days +=1;
                load =i;
            }
            else{
                load += i;
            }
        }
        return days;

    }
}
