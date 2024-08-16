package Recursion;

import java.util.Objects;

public class PalindromeString {
    public static void main(String[] args) {
        String[] strings = {"D", "D", "D","D","D"};
        boolean result=check(strings,0);
        System.out.println(result);
    }

    private static boolean check(String[] strings,int i) {
        int n=strings.length;
        if (i>=n/2)
            return true;

        if (!Objects.equals(strings[i], strings[n - i - 1]))
            return false;
        return check(strings,i+1);
    }

}
