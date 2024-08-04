package Recursion;

public class PowerOfX {
    public static void main(String[] args) {
        double x=2.100;
        int n=-2;
        System.out.println(powerOf(x,n));
    }

    private static double powerOf(double x, int n) {
        double ans = 1.0;
        long nn = n;
        if (nn < 0) nn = - nn;
        while (nn > 0) {
            if (nn % 2 == 1) {
                ans = ans * x;
                nn = nn - 1;
            } else {
                x = x * x;
                nn = nn / 2;
            }
        }
        if (n < 0) ans = 1.0 / ans;
        return ans;
    }

}

