package baoziDemo;

public class BaoZipuThread extends Thread {

    private BaoZi baoZi;

    public BaoZipuThread(BaoZi baoZi) {
        this.baoZi = baoZi;
    }



    @Override
    public void run() {
        while (true){
            synchronized (baoZi){
                if (baoZi.getState()==true){
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    baoZi.setSkin("薄皮");
                    baoZi.setStuffing("豆腐馅");
                    System.out.println("正在生产"+baoZi.skin+baoZi.stuffing+"包子");
                    try {
                        sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    baoZi.setState(true);
                    System.out.println("包子已经生产好了");
                    baoZi.notify();
                }
            }
        }
    }
}
