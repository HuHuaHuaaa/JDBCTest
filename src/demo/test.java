package demo;

import java.util.ArrayList;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random r=new Random();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int n=r.nextInt(33)+1;
            list.add(n);
        }
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }



    }
}
