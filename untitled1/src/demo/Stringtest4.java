package demo;

import java.util.Random;

public class Stringtest4 {
    static void main(String[] args) {
        String s="jkl123klkl56k4";
        StringBuilder s1=new StringBuilder(s);
        System.out.println(addStarAroundNumbers(s));
        String result = "jkl123klkl56k4".replaceAll("(\\d+)", "*$1*");
        System.out.println(result);  // jkl*123*klkl*56*k*4*

        System.out.println(yanzhenma());
    }
    public static String addStarAroundNumbers(String str) {
        StringBuilder sb = new StringBuilder();
        boolean inNumber = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                // 如果是数字组开始，先加 *
                if (!inNumber) {
                    sb.append('*');
                    inNumber = true;
                }
                sb.append(c);
            } else {
                if (inNumber) {
                    sb.append('*');
                    inNumber = false;
                }
                sb.append(c);
            }
        }

        // 如果最后是数字组，需要闭合 *
        if (inNumber) {
            sb.append('*');
        }

        return sb.toString();
    }
    public  static  String yanzhenma(){
        Random random=new Random();
        StringBuilder sb=new StringBuilder();
        char[] r=new char[52];
        for (int i = 0; i < 26; i++) {
                r[i] = (char) ('a' + i);
        }
        for (int i = 0; i < 26; i++) {
                r[i+26] = (char) ('A' + i);
        }

        for (int j = 0; j < 5; j++) {
            int index=random.nextInt(0,52);

            sb.append(r[index]);
        }
        int index1=random.nextInt(10);
        sb.append(index1);
        return  sb.toString();
    }
}


