package demo;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {
    public static void main(String[] args) {
        System.out.println("请输入一串字符：");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] chars = str.toCharArray();//将输入的字符串转化为数组进行遍历
        HashMap<Character, Integer> map = new HashMap<>();
        for (char chars1 : chars) {
            //key存在
            if (map.containsKey(chars1)){
                Integer value=map.get(chars1);
                value++;
                map.put(chars1,value);
            }
            //key不存在
            else {
                Integer value=1;
                map.put(chars1,value);
            }
        }
        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }

    }
}
