package Threaddemo;

import java.util.concurrent.*;

public class ExecutorServicedemo1 {
    static void main(String[] args) {
        ExecutorService pool=new ThreadPoolExecutor(3,5,
                10, TimeUnit.SECONDS,new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.CallerRunsPolicy());
        Runnable r=new primerun1();
        pool.execute(r);//
        pool.execute(r);//
        pool.execute(r);//core
        pool.execute(r);
        pool.execute(r);
        pool.execute(r);
        pool.execute(r);//new Thread
        pool.execute(r);//new Thread
        pool.execute(r);//reject
    }
}

class primerun1 implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 6; i++) {
            System.out.println(Thread.currentThread().getName()+"runnable"+i);
            if(i==0){
                try {
                    Thread.sleep(100000000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

