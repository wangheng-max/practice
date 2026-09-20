package demo1;

import java.util.*;
import java.util.function.BiConsumer;

public class MapDemo2 {
    static void main(String[] args) {
       // Map<String,Integer> map=new HashMap<>();
        calc();

    }
    public static void calc(){
        List<String> list=new ArrayList<>();
        String str[]={"A","B","C","D"};
        Random r=new Random();
        for (int i = 0; i <=80; i++) {
            int index=r.nextInt(str.length);
            list.add(str[index]);
        }
        System.out.println(list);
        Map<String,Integer> map=new TreeMap<>();
      Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for (String s : list) {
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }else {
                map.put(s,1);
            }
        }
        map.forEach((s, integer)-> {
            System.out.println(s + "=" + integer);
        });
        // map.forEach(new );
    }
}
