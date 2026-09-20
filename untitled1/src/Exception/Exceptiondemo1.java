package Exception;

import java.util.Scanner;
import java.util.SequencedCollection;

public class Exceptiondemo1 {
    static void main(String[] args) {
        while (true) {
            try {
                System.out.println(div());
                break;
            } catch (Exception e) {
                System.out.println("分母不为0");
            }
        }
    }

    public static int div() throws Exception{
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
     int   b=sc.nextInt();
        if(b==0){
            throw new Illeagalexception("分母不能为0");
        }
        int result=a/b;
        return result;
    }
}
