package ArrayQuestion;

public class ConsucativeElement {
    public static void main(String[] args) {
        int[] a={1,1,0,1,1,1,0,1,1,1,1};
        int max=0;
        int  count=0;
        for (int j : a) {
            if (j == 1) {
                count++;

            } else {
                count = 0;
            }
            max = Math.max(max, count);

        }
        System.out.println(max);
    }
}
