package demo;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str=sc.next();
        
        int countUpper=0;
        int countLower=0;
        int countNumber=0;
        int countOther=0;
        
        char[] chars=str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch=chars[i];
            if ('A'<=ch && ch<='Z'){
                countUpper++;
            }
            else if ('a'<=ch && ch<='z'){
                countLower++;
            }
            else if ('0'<=ch && ch<='9'){
                countNumber++;
            }
            else countOther++;
        }
        System.out.println("总个数："+chars.length);
        System.out.println("大写字母个数："+countUpper);
        System.out.println("小写字母个数："+countLower);
        System.out.println("数字个数："+countNumber);
        System.out.println("其他个数："+countOther);
    }
}
