package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CustomComparator {
    public static void main(String[] args) {
        Animal a1=new Animal(4,"leo",4);
        Animal a2=new Animal(4,"bruno",20);
        Animal a3=new Animal(7,"kangaroo",12);
        Animal a4=new Animal(8,"Done",25);

        List<Animal> animals = new ArrayList<>();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        animals.add(a4);
        System.out.println(animals);

        Collections.sort(animals);
        System.out.println(animals);

    }
}
