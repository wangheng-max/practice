package UDP;
import java.net.DatagramPacket;
import  java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPclientDemo1 {
    static void main(String[] args) throws Exception {
        System.out.println("客户端==");
        DatagramSocket ds=new DatagramSocket();
        Scanner sc=new Scanner(System.in);
        System.out.println("请发消息");

        while (true) {
            String msg=sc.nextLine();
            if(msg.equals("exit")){
                System.out.println("客户端退出");
                ds.close();
                break;

            }byte buff[]=msg.getBytes();
            DatagramPacket packet=new DatagramPacket(buff,buff.length,
                    InetAddress.getLocalHost(),8080);

            ds.send(packet);
        }

    }
}
