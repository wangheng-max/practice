package demo;

public class Stringtest3 {
    static void main(String[] args) {
        String number = "123456789";
        String s = number.substring(0, 4) + "****" + number.substring(8, number.length());
        System.out.println(s);
        String email = "adasd@qq.com";
        int index;
        index = email.indexOf('@');
        String s1 = email.substring(0, 1);
        String s3;
        String s2 = "";
        int i = 0;
        while (true) {
            char c = email.charAt(i);
            if (c != '@') {
                s2 = s1 + "*";
                i++;
            } else {

                break;
            }
        }
        s3 = s2 + email.substring(index,email.length());
        System.out.println(s3);
        char a='a';
        char b='8';
        System.out.println(Character.isDigit(b));
        System.out.println(Character.isDigit(a));
    }

}
