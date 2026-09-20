package BSdemo;

import java.io.*;
import java.net.Socket;

public class ServerReader extends Thread{
    private Socket socket;
    public ServerReader(Socket s){
        this.socket=s;
    }
    @Override
    public void run(){

        try {
            OutputStream os=socket.getOutputStream();
            PrintStream ps=new PrintStream(os);
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=utf-8");
            ps.println();
            ps.println("<html>");
            ps.println("<head>");
            ps.println("<meta charset=utf-8>");
            ps.println("<title>");
            ps.println("张成是伟哥");
            ps.println("</title>");
            ps.println("</head>");
            ps.println("<body>");
            ps.println("<h1 style='color:red;font-size=20px'>zc是伟人</h1>");
            ps.println("<img src='D:\\111.jpg' width='300'>");
            ps.println("</body>");
            ps.println("</html>");
            ps.close();
            socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
