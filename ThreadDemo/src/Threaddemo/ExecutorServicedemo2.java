package Threaddemo;

import java.util.concurrent.*;

public class ExecutorServicedemo2 {
    static void main(String[] args) {
        ExecutorService pool = new ThreadPoolExecutor(3, 5,
                10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());

        Future<String> submit = pool.submit(new mycallable1(10));
        Future<String> submit1 = pool.submit(new mycallable1(20));
        Future<String> submit2 = pool.submit(new mycallable1(30));
        Future<String> submit3 = pool.submit(new mycallable1(40));

        try {
            System.out.println(submit.get());
            System.out.println(submit1.get());
            System.out.println(submit2.get());
            System.out.println(submit3.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }

}


class mycallable1 implements Callable<String >{
    private int n;
    public  mycallable1(int n){
        this.n=n;
    }
    public String call() {
        synchronized (this) {
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                sum += i;
               // System.out.println(i);
            }
            return "qiuhe" + sum;
        }
    }
}


