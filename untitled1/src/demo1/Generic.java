package demo1;
import  java.sql.DriverManager;
import  java.sql.Connection;
import  java.sql.SQLException;

public class Generic {
    static void main(String[] args) {
        MyArraylist<String> mylist =new MyArraylist<>();
        mylist.add("whh");
        System.out.println(mylist.toString());
        String str="111";
        int i=Integer.valueOf(str);
        double j=Double.parseDouble(str);
        System.out.println(i+1);
        System.out.println(j);

    }
    public  static <E> E getmax(E[] name){

        return null;
    }
}
