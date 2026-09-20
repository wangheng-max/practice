package BSdemo;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class TCPserverDEmo {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(7070);
        ExecutorService pool=new ThreadPoolExecutor(3,10,10,
                TimeUnit.SECONDS,
              new ArrayBlockingQueue<>(100),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        while (true) {
            Socket accept = serverSocket.accept();
            System.out.println("客户上线了 " + accept.getInetAddress().getHostAddress());
            System.out.println("端口 " + accept.getPort());
        }
    }
}
