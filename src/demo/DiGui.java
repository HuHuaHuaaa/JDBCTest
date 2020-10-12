package demo;

public class DiGui {
    public static void main(String[] args) {
        System.out.println(jiecheng(5));
        System.out.println(addmore(4));
    }
    public static int jiecheng(int n){
        if(n==1){
            return 1;
        }
        return n*jiecheng(n-1);
    }
    public static int addmore(int n){
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum=sum+i;
        }
        return sum;

    }
}
