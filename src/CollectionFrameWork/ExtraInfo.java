package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExtraInfo {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("kiwi");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        Iterator<String> fe=fruits.iterator();//we can also use  .listiterator in place of iterator same , but  we can use as per our use
        while (fe.hasNext()){
            System.out.println("Iterator"+fe.next());
        }
        List<String> smallestString = fruits.subList(1,3);
        System.out.println(smallestString);

    }
}
