package demo1;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.util.Arrays;

public class FileInputStream1 {
    static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("F:\\java\\untitled\\untitled1\\src\\demo11.txt");
        byte buffer[]=new byte[6];
        byte buffer1 []=is.readAllBytes();
        String str1=new String(buffer1);
        System.out.println(str1);
        FileUtils.copyFile(new File("F:\\java\\untitled\\untitled1\\src\\demo11.txt"),new File("F:\\java\\untitled\\untitled1\\src\\demo1222.txt"));
//        int b;
//        while ((b = is.read(buffer)) != -1) {
//            String str=new String(buffer,0,b);
//            System.out.print(str);
//        }
        is.close();
    }
}
