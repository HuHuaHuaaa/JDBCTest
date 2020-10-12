package demo;

import java.util.ArrayList;
import java.util.Collections;

/*
扑克牌案例
        1.准备牌
        2.洗牌
        3.发牌
        4.看牌
    */
public class PokerTest {
    public static void main(String[] args) {

        //准备牌
        //定义一个集合存储扑克牌
        ArrayList<String> poker=new ArrayList<>();

        //定义两个数组分别存储花色和牌号
        String [] colors={"♠","♥","♣","♦"};
        String [] numbers={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("大王");
        poker.add("小王");

        for (String color : colors) {
            for (String number : numbers) {
                poker.add(color+number);
            }
        }

        //洗牌
        Collections.shuffle(poker);

        //发牌
        ArrayList<String> player1=new ArrayList<>();
        ArrayList<String> player2=new ArrayList<>();
        ArrayList<String> player3=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if (i>=51){
                //给底牌发牌
                dipai.add(p);
            }else if (i%3==0){
                player1.add(p);
            }else if (i%3==1){
                player2.add(p);
            }else if (i%3==2){
                player3.add(p);
            }
        }
        System.out.println("玩家1"+player1);
        System.out.println("玩家2"+player2);
        System.out.println("玩家3"+player3);
        System.out.println("底牌"+dipai);

    }
}
