package Threaddemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadTest {
    static void main(String[] args) {
        List<Integer> redbull=getredPacket();

        for (int i = 0; i < 100; i++) {
            new Peoplegetp(redbull,"人"+i).start();

        }


    }

    public static List<Integer> getredPacket(){
        Random r=new Random();
        List<Integer> redpacket=new ArrayList<>();
        for (int i = 0; i < 160; i++) {
            redpacket.add(r.nextInt(30)+1);
        }
        for (int i = 0; i < 40; i++) {
            redpacket.add(r.nextInt(70)+31);
        }
        return redpacket;
    }
}
