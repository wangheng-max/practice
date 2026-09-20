package demo2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterdemo {
    static void main(String[] args) throws Exception{
        try(Writer fw=new FileWriter("F:\\java\\untitled\\untitled1\\src\\demo122.txt",true) ;) {


            fw.write(22);
            fw.write("挖到");
            fw.write("/r/n");
            char str []="wwwcccddd挖的".toCharArray();
            fw.write(str);
            fw.write(str,0,2);
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
