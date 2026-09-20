package demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Stringtest1 {
    static void main(String[] args) {
       String st="abcdeaa";
        for (int i = 0; i < st.length(); i++) {
            char s=st.charAt(i);
            System.out.println(s);
        }
        String str1=st.substring(1,st.length()-1)+"*";
        System.out.println(str1);
        String str2=st.replace("a","e");
        System.out.println(str2);
        System.out.println(st.indexOf("a"));

        //lambda表达式
        String arr[]={"a","aa","aaa","aaaa"};
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });

        Arrays.sort(arr, (o1, o2)-> o2.length()-o1.length());
        System.out.println(Arrays.toString(arr));


    }
}
