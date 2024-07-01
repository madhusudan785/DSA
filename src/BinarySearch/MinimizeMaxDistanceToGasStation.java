package BinarySearch;

public class MinimizeMaxDistanceToGasStation {
    public static void main(String[] args) {
        int [] arr={1,13,17,23};
        int k=5;
        double result=simplify(arr,k);
        System.out.println(result);
    }

    private static double simplify(int[] arr, int k)
    {
        int n = arr.length; // size of the array
        double low = 0;
        double high = 0;

        //Find the maximum distance:
        for (int i = 0; i < n - 1; i++) {
            high = Math.max(high, arr[i + 1] - arr[i]);
        }

        //Apply Binary search:
        double diff = 1e-6 ;
        while (high - low > diff) {
            double mid = (low + high) / (2.0);
            int cnt = numberOfGasStationsRequired(mid, arr);
            if (cnt > k) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return high;

    }

    private static int numberOfGasStationsRequired( double dist, int[] arr) {
        int n = arr.length; // size of the array
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            int numberInBetween = (int)((arr[i] - arr[i - 1]) / dist);
            if ((arr[i] - arr[i - 1]) == (dist * numberInBetween)) {
                numberInBetween--;
            }
            cnt += numberInBetween;
        }
        return cnt;
    }
}
/*
brute force
 int n=arr.length;
        int[] howMany = new int[n-1];
        for (int gasStation = 1; gasStation <=  k; gasStation++) {
            double maxSection=-1;
            double maxIndex=-1;
            for(int i=0;i<n-1;i++){
                double diff=arr[i + 1] - arr[i];
                double sectionLength=diff/(double) (howMany[i]+1);
                if (sectionLength>maxSection){
                    maxSection=sectionLength;
                    maxIndex=i;
                }
            }
            howMany[(int) maxIndex]++;
        }
        double maxAns=-1;
        for(int i=0;i<n-1;i++){
            double diff=arr[i + 1] - arr[i];
            double sectionLength=diff/(double) (howMany[i]+1);
            maxAns=Math.max(maxAns,sectionLength);
        }
        return maxAns;
 */
