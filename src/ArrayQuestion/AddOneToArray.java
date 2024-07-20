package ArrayQuestion;

import java.util.Arrays;

public class AddOneToArray {
    public static void main(String[] args) {
        int[] digits={9,9};
        int carry=1;
        for (int i = digits.length-1; i >= 0; i--) {
            int sum=digits[i]+carry;
            digits[i]=sum%10;
            carry=sum/10;
        }
        if (carry > 0) {
            int[] newArr = new int[digits.length + 1];
            newArr[0] = carry;
            System.arraycopy(digits, 0, newArr, 1, digits.length);
            digits = newArr;
        }

        System.out.println(Arrays.toString(digits));
    }
}
