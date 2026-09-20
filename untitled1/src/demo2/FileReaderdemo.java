package demo2;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderdemo {
    static void main(String[] args) throws Exception {
        Reader reader=new FileReader("F:\\\\java\\\\untitled\\\\untitled1\\\\src\\\\demo122");
        char buffer[]=new char[3];
        int len;
        while ((len=reader.read(buffer))!=-1){
            String str=new String(buffer,0,len);
            System.out.print(str);
        }

    }
}
