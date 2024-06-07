package CollectionFrameWork;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapConcept {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("us","United State");
        map.put("Ind","India");
        map.putIfAbsent("In","INdian");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String , String> entry : entries){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
//        map.remove("us");
//        System.out.println(map);
//        Set<String> set = map.keySet();
//        Collection<String> set = map.values();//it only returns the value in the form of
//        // collection so if we want to type cast with list or arraylist it gives error also allows duplicates in it.
//        System.out.println(set);//it put only keys
    }
}
