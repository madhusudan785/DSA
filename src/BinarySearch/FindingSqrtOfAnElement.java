package BinarySearch;

public class FindingSqrtOfAnElement {
    public static void main(String[] args) {
        int n=28;
        int result=findElement(n);
        System.out.println(result);
    }

    private static int findElement(int n) {

        int low=1;
        int high= n;
        while (low<=high){
            long mid=(low+high)/2;
            long val=mid*mid;
            if (val<=n){
                low= (int) (mid+1);
            }
            else {
                high= (int) (mid-1);
            }

        }
        return high;
    }
}
