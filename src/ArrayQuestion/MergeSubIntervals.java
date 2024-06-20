package ArrayQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeSubIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,9},{9,11},{8,10},{2,4},{15,18},{16,17}};
        List<List<Integer>> result = mergeArray(arr);
        for (List<Integer> it : result) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
        System.out.println();

    }

    private static List<List<Integer>> mergeArray(int[][] intervals) {
        List<List<Integer>> ans=new ArrayList<>();
        int n= intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        for (int[] interval : intervals) {
            // if the current interval does not
            // lie in the last interval:
            if (ans.isEmpty() || interval[0] > ans.getLast().get(1)) {
                ans.add(Arrays.asList(interval[0], interval[1]));
            }
            // if the current interval
            // lies in the last interval:
            else {
                ans.getLast().set(1,
                        Math.max(ans.getLast().get(1), interval[1]));
            }
        }

        return ans;
    }
}
/*
 for (int i = 0; i < n; i++) {
            int start = intervals[i][0];
            int end= intervals[i][1];
            //skip all the merge interval
            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1))
                continue;
            for (int j = i+1; j <n ; j++) {
                if (intervals[j][0] <= end){
                    end = Math.max(end, intervals[j][1]);
                }
                else {
                    break;
                }
            }
            ans.add(Arrays.asList(start,end));
        }
 */