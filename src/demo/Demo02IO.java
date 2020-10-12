package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02IO {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\IOtest\\a.txt");
        //fos.write(97);
        byte[] bytes={65,66,67,68};
        //byte[] b = "你好".getBytes();
//        for (int i = 0; i <10 ; i++) {
//            fos.write("你好".getBytes());
//            fos.write("\r\n".getBytes());
//        }
        fos.write(bytes);
        //fos.write(b);
        fos.close();
        FileInputStream fis=new FileInputStream("D:\\IOtest\\a.txt");
        int len=0;
        while ((len=fis.read())!=-1){
            System.out.println((char) len);
        }
        fis.close();
    }
}
