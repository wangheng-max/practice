package Threaddemo;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class Peoplegetp extends Thread {
    private List<Integer> redbull;

    public Peoplegetp(List<Integer> redbull, String s) {
        this.redbull=redbull;
        super(s);
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true) {
            synchronized (redbull) {
                if (redbull.size() == 0) {
                    break;

                }
                int index = (int) (Math.random() * redbull.size());
                Integer money = redbull.remove(index);
                System.out.println( name + "抢到了" + money);
                if (redbull.size() == 0) {
                    System.out.println("end");
                    break;
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


