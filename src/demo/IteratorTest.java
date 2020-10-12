package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection<String> objects = new ArrayList<>();
        objects.add("姚明");
        objects.add("科比");
        objects.add("詹姆斯");
        objects.add("乔丹");
        objects.add("麦迪");
        System.out.println(objects);
        System.out.println(objects.size());
        Iterator<String> it = objects.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }










    }
}
