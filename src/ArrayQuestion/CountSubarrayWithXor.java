package ArrayQuestion;

import java.util.HashMap;
import java.util.Map;

public class CountSubarrayWithXor {
    public static void main(String[] args) {
        int[] arr = {4,2,2,6,4};
        int k=6;
        int result=countSubarray(arr,k);

        System.out.println(result);
    }

    private static int countSubarray(int[] arr, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int count=0,xr=0;
        map.put(xr,1);
        for (int i = 0; i < arr.length; i++) {
            //prefix xor till index
            xr=xr^arr[i];

            //by putting formula
            int x =xr ^ k;

            if (map.containsKey(x))
                count += map.get(x);

            if (map.containsKey(xr))
                map.put(xr,map.get(xr)+1);
            else
                map.put(xr,1);
        }
        return count;
    }
}
/*
better solution
 for (int i = 0; i < arr.length; i++) {
int xor=0;
            for (int j = i; j < arr.length ; j++) {
xor=xor ^ arr[j];
        if (xor == k){
count++;
        }
        }

        }

 */