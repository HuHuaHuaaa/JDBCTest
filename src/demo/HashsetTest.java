package demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetTest {
    public static void main(String[] args) {
//        Set<Integer> set=new HashSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(1);
//        Iterator<Integer> ite = set.iterator();
//        while(ite.hasNext()){
//            System.out.println(ite.next());
//        }
//        System.out.println("===================");
//        for (Integer i : set) {
//            System.out.println(i);
//
//        }
        System.out.println(add(9,10));
    }


    public static int add(int...arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
