package Threaddemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class tdemo2 {
    static void main(String[] args) {
            Callable<String> mc=new mycallable(100);
            FutureTask<String> futureTask =new FutureTask<>(mc);
            Thread t=new Thread(futureTask);
            t.start();

            Callable<String> mc1=new mycallable(10);
            FutureTask<String> futureTask1 =new FutureTask<>(mc1);
            Thread t1=new Thread(futureTask1);
            t1.start();

        try {
            System.out.println(futureTask.get());
            System.out.println(futureTask1.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
class mycallable implements Callable<String >{
    private int n;
    public  mycallable(int n){
        this.n=n;
}

    public String call() {
        synchronized (this) {
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                sum += i;
                System.out.println(i);
            }
            return "qiuhe" + sum;
        }
    }
}
