package BinarySearch;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] arr = {805306368, 805306368, 805306368};
        int h = 1000000000;
        int result = minEatingSpeed(arr, h);
        System.out.println(result);
    }

    public static int findMax(int[] v) {
        int maxi = Integer.MIN_VALUE;

        int n = v.length;
        //find the maximum:
        for (int j : v) {
            maxi = Math.max(maxi, j);
        }
        return maxi;
    }

    public static int calculateTotalHours(int[] v, int hourly) {
        int totalH = 0;
        //find total hours:
        for (int j : v) {
            totalH += Math.ceil((double) j / (double) (hourly));
        }
        return totalH;
    }

    public static int minEatingSpeed(int[] v, int h) {
        int low = 1, high = findMax(v);

        //apply binary search:
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = calculateTotalHours(v, mid);
            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}

