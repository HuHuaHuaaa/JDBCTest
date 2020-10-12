package baoziDemo;

public class BaoZiTest {
    public static void main(String[] args) {
        BaoZi baoZi=new BaoZi();
        new BaoZipuThread(baoZi).start();
        new ChiHuoThread(baoZi).start();

    }
}
