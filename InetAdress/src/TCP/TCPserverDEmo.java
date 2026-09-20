package TCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPserverDEmo {
    static void main(String[] args) throws Exception {

        ServerSocket serverSocket=new ServerSocket(9898);


      //  int id=dis.readInt();
        while (true) {
            Socket accept = serverSocket.accept();
            System.out.println("客户上线了"+accept.getInetAddress().getHostAddress());
            System.out.println("端口"+accept.getPort());
            new ServerReader(accept).start();

        }


    }
}
