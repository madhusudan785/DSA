package BinarySearch;

public class NthElementInAnArray {
    public static void main(String[] args) {
        int n=3;
        int m=27;
        int result=findElement(n,m);
        System.out.println(result);
    }

    private static int findElement(int n, int m) {
        int low=1;
        int high=m;
        while (low<=high){
            int mid=low+(high-low)/2;
            int midN=square(n,m,mid);
            if(midN==1) {
                return mid;
            }
            else if (midN==0) {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return -1;

    }

    private static int square(int n,int m, int mid) {//this is use for bigger value like n=10 and m=10^9 we can't Store that and compute every time.
    long ans=1;
        for (int i = 1; i <= n; i++) {
            ans=ans*mid;//this checks whether it overflow if it is then go to the findElement function to stop that or decrease the right or left value.
            if (ans>m){
                return 2;
            }

        }
        if (ans==m)
            return 1;
        return 0;

    }
}
