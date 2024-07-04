package BinarySearch;

public class FindPeakInTwoDArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4,5,6,7,8},{2,3,4,5,6,7,8,9},{3,4,5,6,7,8,9,10},{4,5,6,7,8,9,10,11}};
        int[] result=findPeakGrid(arr);
        for (int j : result) {
            System.out.print(j + " ");
        }
    }
    public static int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int low=0,hgh=m-1;
        while (low<=hgh){
            int mid=(low+hgh)/2;
            int maxRowIndex=func(mat,n,m,mid);
            int left=mid-1 >=0 ?mat[maxRowIndex][mid-1] : -1;//if there is nothing in left side assume a small number
            int right=mid+1 < m ?mat[maxRowIndex][mid+1] : -1;
            if(mat[maxRowIndex][mid]>left && mat[maxRowIndex][mid]>right){
                return new int[]{maxRowIndex,mid};
            }
            else if(mat[maxRowIndex][mid]<left){
                hgh=mid-1;
            }
            else {
               low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }

    private static int func(int[][] matrix, int n, int m, int col) {
        int maxValue=-1;
        int index=-1;
        for(int i=0;i<n;i++){
            if (matrix[i][col]>maxValue){
                maxValue=matrix[i][col];
                index=i;
            }
        }
        return index;
    }
}
