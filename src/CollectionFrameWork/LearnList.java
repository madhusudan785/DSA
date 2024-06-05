package CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {
        List<Integer> lt=new ArrayList<>();
//        List<Integer> lt1=new ArrayList<>();
        lt.add(12);
        lt.add(233);
        lt.add(23);
        lt.add(3);
        System.out.println(lt);//internally .toString is written
        System.out.println(lt.indexOf(23));//if not present then returns 0



//        System.out.println(lt.get(1));
//        lt.set(2,20);//set(int index , Integer element)
//        lt.add(3,40);//add(int index , Integer element)
//        System.out.println(lt);//23->20
//        lt.addAll(lt1);
//        lt.removeAll(lt1);
//        lt.retainAll(lt1);//for intersection purpose
//        Object a[] = lt.toArray();
//        for (Object e :a)
//        {
//            Integer temp = (Integer) e;
//            System.out.println(e);
//        }
//
//        System.out.println(lt);
// lt1.add(12);
//        lt1.add(1);
//        lt1.add(33);
//        lt1.add(2);
//        System.out.println(lt.size());//size is method to know the size
//        System.out.println(lt.contains(233));//contains method is using to search that element present in the array or not
//        //it gives the o/p as true or false
//        lt.remove(1);
//        System.out.println(lt);//it removes the value present in that index
//        lt.remove(Integer.valueOf(23));
       // it removes the actual value
    }
}
