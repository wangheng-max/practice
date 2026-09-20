package demo;

import java.util.Scanner;

public class Stringtest {
    static void main(String[] args) {
        String name="whh";
        String name1=new String("whh");
        System.out.println(name.equals(name1));
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String testname=sc.nextLine() ;
            if(testname.equals(name)){
                System.out.println("success");
                break;
            }else {
                System.out.println("qingchongxshur");
            }
        }
    }
}
