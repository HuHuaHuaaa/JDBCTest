package demo;

public class MathTest {
    public static void main(String[] args) {
        double min=-10.8;
        double max=5.9;
        int count=0;
        for(int i=(int)Math.ceil(min);i<=Math.ceil(max);i++){
            if(Math.abs(i)<2.1 || Math.abs(i)>6){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("=============");
        System.out.println(count);
    }
}
