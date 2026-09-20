package TCP;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.DatagramSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPclientDEmo {
    static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1", 9898);
        OutputStream outputStream = socket.getOutputStream();

        DataOutputStream dos=new DataOutputStream(outputStream);
        Scanner sc=new Scanner(System.in);

        while (true) {
            System.out.println("请入消息");
            String msg=sc.nextLine();
            if(msg.equals("exit")){
                System.out.println("end");
                dos.close();
                socket.close();
                break;
            }
            dos.writeUTF(msg);
            dos.flush();

        }


    }
}
