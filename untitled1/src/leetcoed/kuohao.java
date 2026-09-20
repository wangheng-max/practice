package leetcoed;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;
import java.util.Stack;

public class kuohao {
    static void main(String[] args) {
                String s="({{()}})";
        System.out.println(kuohao(s));
    }
    public static boolean kuohao(String s){
        HashMap<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        Stack<Character> queue=new Stack<>();
        for(Character c : s.toCharArray()){
            if(map.containsKey(c)) {
                if (queue.isEmpty() || queue.pop()!=(map.get(c)))
                    return false;
            }else {
                    queue.push(c);
                }
        }
        return queue.isEmpty();
    }
}
