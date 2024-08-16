package Recursion;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        int n=6;
//        int sum=0;
        System.out.println(sum(n));
    }

    private static int sum(int i) {

        if (i==0)
            return 0;

        return i+sum(i-1);

    }
}
//if (i<1){
//            System.out.println(sum);
//            return;
//        }
//        sum(i-1,sum+i);