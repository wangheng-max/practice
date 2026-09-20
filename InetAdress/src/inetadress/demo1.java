package inetadress;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class demo1 {
    static void main(String[] args) {
        try {
            InetAddress ip1=InetAddress.getLocalHost();
            System.out.println(ip1.getAddress());
            System.out.println(ip1.getHostAddress());

            InetAddress ip2=InetAddress.getByName("www.baidu.com");
            System.out.println(ip2.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
