package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPserviceDemo1 {
    static void main(String[] args) throws Exception {
        DatagramSocket socket=new DatagramSocket(8080);
        byte buff[]=new byte[1024*64];
        DatagramPacket packet=new DatagramPacket(buff,buff.length);

        while (true) {
            socket.receive(packet);
            //  packet.getLength();

            String information=new String(buff,0, packet.getLength());
            System.out.println("服务端收到"+information);

            String ip=packet.getAddress().getHostAddress();
            int port=packet.getPort();
            System.out.println("对方ip"+ip+"对方端口"+port);

            System.out.println("-----");
        }
    }
}
