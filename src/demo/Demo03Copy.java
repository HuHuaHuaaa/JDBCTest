package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/*
     文件复制demo
*/
public class Demo03Copy {
    public static void main(String[] args) throws IOException {
        method1();
        System.out.println("==========");
        method2();
    }

    public static void method1() throws IOException {
        long s=System.currentTimeMillis();
        FileInputStream fis=new FileInputStream("D:\\IOtest\\1.jpg");
        FileOutputStream fos=new FileOutputStream("D:\\IOtest\\copy\\3.jpg");
        byte[] bytes=new byte[1024];
        int len = 0;
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
        long e=System.currentTimeMillis();
        System.out.println("复制总共花费"+(e-s)+"毫秒");
    }

    public static void method2() throws IOException {
        long s=System.currentTimeMillis();
        FileInputStream fis=new FileInputStream("D:\\IOtest\\1.jpg");
        FileOutputStream fos=new FileOutputStream("D:\\IOtest\\copy\\2.jpg");
        int len = 0;
        while ((len=fis.read())!=-1){
            fos.write(len);
        }
        fos.close();
        fis.close();
        long e=System.currentTimeMillis();
        System.out.println("复制总共花费"+(e-s)+"毫秒");
    }
}
