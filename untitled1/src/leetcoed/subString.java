package leetcoed;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class subString {
    static void main(String[] args) {
        String s="bbbbbb";
        System.out.println(getSub(s));
    }
    public static Set<Character> getSub(String s){
        HashSet<Character> set=new HashSet<>();
        int left=0;
        for (int right = 0; right < s.length(); right++) {
            char c=s.charAt(right);
            while (set.contains(right)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
        }
        return set;
    }
 }
