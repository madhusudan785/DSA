package BinarySearch;

public class FindKthElementRowAndColAreSorted {
    public static void main(String[] args) {
        int[][] arr={{4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,29},{18,21,23,26,30}};
        int target = 14;
        boolean result=searchElement(arr,target);
        System.out.println(result);
    }

    private static boolean searchElement(int[][] arr, int target) {
        int row=0,col=arr.length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                return true;
            } else if (arr[row][col]<target) {
                col--;

            }
            else {
                row++;
            }
        }
        return false;
    }

}
