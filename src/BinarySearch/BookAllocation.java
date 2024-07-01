package BinarySearch;

public class BookAllocation {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int student =2;
        int result = allocation(arr,student);
        System.out.println(result);

    }

    private static int allocation(int[] arr, int student) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for (int i : arr) {
            low = Math.max(low, i);
            high +=i;
        }
        while (low<=high){
            int mid = (low+high)/2;
            int noOfStudents = func(arr,mid);
            if (noOfStudents > student){
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return low;
    }

    private static int func(int[] arr, int pages) {
        int student = 1,pageStudent=0;
        for (int i : arr) {
            if (pageStudent+i <= pages){
                pageStudent += i;
            }
            else {
                student++;
                pageStudent=i;
            }
        }
        return student;
    }
}
