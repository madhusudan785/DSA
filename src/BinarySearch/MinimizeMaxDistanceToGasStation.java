package BinarySearch;

public class MinimizeMaxDistanceToGasStation {
    public static void main(String[] args) {
        int [] arr={1,13,17,23};
        int k=5;
        double result=simplify(arr,k);
        System.out.println(result);
    }

    private static double simplify(int[] arr, int k) {
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
    }
}
