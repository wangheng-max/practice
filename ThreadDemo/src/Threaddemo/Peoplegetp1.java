package Threaddemo;

import java.util.List;
import java.util.concurrent.Callable;

public class Peoplegetp1 implements Callable {
    private List<Integer> redbull;

    public Peoplegetp1(List<Integer> redbull, String s) {
        this.redbull=redbull;
        super();
    }


    @Override
    public List<Integer> call() throws Exception {
        String name = Thread.currentThread().getName();
        while (true) {
            synchronized (redbull) {
                if (redbull.size() == 0) {
                    break;

                }
                int index = (int) (Math.random() * redbull.size());
                Integer money = redbull.remove(index);
                System.out.println(name + "抢到了" + money);
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
        return null;
    }
}


