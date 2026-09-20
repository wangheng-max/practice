package Threaddemo;

public class tapidemo {
    static void main(String[] args) {
        Thread t=new ewThread();
        t.setName("11");
        t.start();

        System.out.println(t.getName());
        Thread t2=new ewThread("22");
       // t2.setName("22");
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        Thread m=Thread.currentThread();
        System.out.println(m.getName());
    }
}
class  ewThread extends Thread{
    public ewThread(){

    }
    public ewThread(String id) {
        super(id);
    }

    @Override
    public  void run(){
        for (int i = 0; i <11 ; i++) {
            System.out.println(Thread.currentThread().getName()+"son"+i);
        }
    }

}
