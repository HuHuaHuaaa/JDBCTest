package baoziDemo;

public class ChiHuoThread extends Thread{

    private BaoZi baoZi;
    public ChiHuoThread(BaoZi baoZi) {
        this.baoZi = baoZi;
    }


    @Override
    public void run() {
        while (true){
            synchronized (baoZi){
                if (baoZi.state==false){
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    System.out.println("吃货吃包子");
                    try {
                        sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("吃货吃完了包子");
                    baoZi.setState(false);
                    baoZi.notify();
                }
            }
            System.out.println("============================");
        }
    }
}
