package ArrayQuestion;

import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;

public class UnionOfArraies {
    public static void main(String[] args) {

        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2, 3, 4, 4, 5, 6};
        int n= arr1.length;
        int m=arr2.length;
        ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Union)
            System.out.print(val+" ");
    }

            static ArrayList<Integer> FindUnion(int[] arr1, int[] arr2, int n, int m) {
                int i = 0, j = 0; // pointers
                ArrayList<Integer > Union=new ArrayList<>(); // Union vector
                while (i < n && j < m) {
                    if (arr1[i] <= arr2[j]) // Case 1 and 2
                    {
                        if (Union.isEmpty() || Union.get(Union.size()-1) != arr1[i])
                            Union.add(arr1[i]);
                        i++;
                    } else // case 3
                    {
                        if (Union.isEmpty() || Union.get(Union.size()-1) != arr2[j])
                            Union.add(arr2[j]);
                        j++;
                    }
                }
                while (i < n) // IF any element left in arr1
                {
                    if (Union.get(Union.size()-1) != arr1[i])
                        Union.add(arr1[i]);
                    i++;
                }
                while (j < m) // If any elements left in arr2
                {
                    if (Union.get(Union.size()-1) != arr2[j])
                        Union.add(arr2[j]);
                    j++;
                }
                return Union;
            }








      /*  Set<Integer> st = new HashSet<>() ;

        for (int i = 0; i < arr1.length; i++) {
            st.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            st.add(arr2[i]);

        }
    int[] union=new int[st.size()];
        int i=0;
        for (int it:st) {
            union[i++] = it;

        }*/

    }




