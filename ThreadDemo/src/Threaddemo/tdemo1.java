package Threaddemo;

public class tdemo1 {
    static void main(String[] args) {
        Thread t=new myThread();
        t.start();

        Runnable pr=new primerun();
        new Thread(pr).start();

        Runnable r=()-> {
                for (int i = 0; i < 6; i++) {
                    System.out.println("runnable"+i);
                }

        };

        for (int i = 0; i < 5; i++) {
            System.out.println(i+99);
        }
    }
}
class myThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}

class primerun implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 6; i++) {
            System.out.println("runnable"+i);
        }
    }
}
