package demo;

public class Stringtest {
    public static void main(String[] args) {
//        String str1="Helloword";
//        String str2=str1.substring(3);//loword
//        System.out.println(str2);
//        String str3=str1.substring(3,5);//lo
//        System.out.println(str3);
        int[] arry={1,2,3,4};
        String result=fromArryToString(arry);
        System.out.println(result);
    }
    public static String fromArryToString( int[] arry){
        String str="[";
        for (int i = 0; i < arry.length; i++) {
            if(i==arry.length-1){
                str +="word"+ arry[i]+"]";
            }
            else
                str +="word"+ arry[i]+"#";

        }
        return str;
    }
}
