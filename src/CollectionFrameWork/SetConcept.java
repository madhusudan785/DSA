package CollectionFrameWork;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetConcept {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();//O(1)
//        Set<Integer> set=new LinkedHashSet<>();//this is using linklist to store the data , t.c->O(n)
//        Set<Integer> set=new TreeSet<>();this is for sorted set to use , t.c->O(logn)
        set.add(10);
        set.add(20);
        set.add(40);
        set.add(30);
        System.out.println(set);//only prints 10 and 30 because they are unique numbers but in random order(unordered)


    }
}
