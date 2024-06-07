package Sorting;

import java.util.Arrays;

public class SelectionSort {//T.c->O(n^2)
    public static void main(String[] args) {
        int[] arr={13,46,24,52,20,9};
        System.out.println(Arrays.toString(arr));
        int n= arr.length;
        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            //swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After Sorting"+Arrays.toString(arr));
        }
    }

