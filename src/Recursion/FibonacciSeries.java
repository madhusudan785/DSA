package Recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n=4;
        int result=call(n);
        System.out.println(result);
    }
    public static int call(int n){
        if (n<= 1){
            return n;
        }
        int last=call(n-1);
        System.out.println("last "+last);
        int slast=call(+n-2);
        System.out.println("second last "+slast);

        System.out.println("result "+last+"+"+slast);
        return last+slast;
    }
}
