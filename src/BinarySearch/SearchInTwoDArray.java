package BinarySearch;

public class SearchInTwoDArray {
    public static void main(String[] args) {
        int[][] arr={{1,4},{2,5}};
        int target=2;
        boolean result=search(arr,target);
        System.out.println(result);
    }

    private static boolean search(int[][] matrix, int target) {
        int n=matrix.length;
        if(n==0) return false;//if the first array length is zero then thee 17line will become zero
        int m=matrix[0].length;

        int low=0,high=n*m-1;//this is for imaginary flattening the 2D to 1D array

        while (low<=high){
            int mid=(low+high)/2;

            int row=mid/m,col=mid%m;//this is for the index value that are required in the next step compare with target

            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]<target){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return false;
    }
}
