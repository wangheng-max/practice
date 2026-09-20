package demo1;

import java.io.*;

public class FileCopy {
    static void main(String[] args) throws Exception {
        try  (InputStream is = new FileInputStream("F:\\java\\untitled\\untitled1\\src\\demo11");
        OutputStream os = new FileOutputStream("F:\\java\\untitled\\untitled1\\src\\demo122");)
        {

            byte buffer[] = is.readAllBytes();
            String str = new String(buffer);

            os.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
