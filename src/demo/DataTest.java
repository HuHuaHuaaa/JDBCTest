package demo;

import javafx.scene.input.DataFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DataTest {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println(22*365);//8030-8395
        System.out.println("请输入你的出生日期：");
        String d = sc.next();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse(d);
        long time = parse.getTime();//解析为格式的出生日期
        Date date=new Date();
        long time1 = date.getTime();
        long result=time1-time;
        System.out.println(time);
        System.out.println(time1);
        System.out.println(result);
        //int day=(int)(result/1000/60/24);
        System.out.println("当前时间为"+simpleDateFormat.format(date));
        System.out.println("你出生了"+result/1000/60/60/24+"天");//8128



    }
}
