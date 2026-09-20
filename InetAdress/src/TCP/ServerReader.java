package TCP;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServerReader  extends Thread{
    private Socket socket;
    public ServerReader(Socket s){
        this.socket=s;
    }

    @Override
    public void run(){
        InputStream inputStream = null;
        try {
            inputStream = socket.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        DataInputStream dis=new DataInputStream(inputStream);

        //  int id=dis.readInt();
        while (true) {
            System.out.println("===");
            String msg = null;
            try {
                msg = dis.readUTF();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("客户下线了");
                break;
            }
            System.out.println(msg);
            System.out.println("客户端ip"+socket.getInetAddress()+"port"+socket.getLocalPort());

        }

    }
}
