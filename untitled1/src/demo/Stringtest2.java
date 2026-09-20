package demo;

public class Stringtest2 {
    static void main(String[] args) {
        StringBuilder str1=new StringBuilder();
        StringBuilder str2=new StringBuilder("abcdabcda");
        str1.append("abaa");
        System.out.println(str1);
        System.out.println(str1.reverse());
        String st=str1.toString();
        System.out.println(st);

        String st1="abcdefghj k";
        String st2= st1.substring(0, 8);
        System.out.println(st2);
        int index=st1.lastIndexOf(' ');
        System.out.println(index);
        System.out.println('1'+0-48);
    }
}
