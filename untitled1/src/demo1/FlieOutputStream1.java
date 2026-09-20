package demo1;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.security.spec.ECField;

public class FlieOutputStream1 {
    static void main(String[] args) throws Exception {
        OutputStream os=new FileOutputStream("F:\\java\\untitled\\untitled1\\src\\demo11.txt",true);
        byte buffer[]="wanasdc玩的得到".getBytes();

        os.write(buffer);
        os.write(buffer,1,4);
        os.close();

    }
}
