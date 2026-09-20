package demo1;

import java.util.*;
import java.util.function.BiConsumer;

public class MapDemo1 {
    static void main(String[] args) {
            Map<String,Integer> map=new HashMap<>();
       // Map<String,Integer> map=new LinkedHashMap<>();

        map.put("aaa",2);
        map.put("bbb",3);
        map.put("bbb",7);
        map.put("ccc",2);
        map.put("ddd",4);
        map.put("eee",5);
        System.out.println(map.size());
        System.out.println(map.get("bbb"));
        System.out.println(map.containsValue(2));
        System.out.println(map.values());
        System.out.println(map);
        Set<String> keeys= map.keySet();
        for (String keey : keeys) {
            System.out.println(keey);
        }
        Iterator<String> count1=keeys.iterator();
        while (count1.hasNext()){
            String key=count1.next();
            System.out.println(key+" "+map.get(key));
        }


        System.out.println("------"+"\n");
        Collection<Integer> coun=map.values();
        Iterator<Integer> keys=coun.iterator();
        while (keys.hasNext()){
            System.out.println(keys.next()+""+map.get(keys));

        }
        System.out.println("--------");
        for (Integer s : coun) {
            System.out.println(s);
        }

        System.out.println("------"+"\n");

        Set<Map.Entry<String, Integer>> entries = map.entrySet();


        for(Map.Entry<String,Integer> entry :entries){
            String key=entry.getKey();
            Integer values=entry.getValue();
            System.out.println(key +""+values);
        }
        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer values) {
                System.out.println(key+"="+values);
            }
        });

        map.forEach((String key,Integer values)-> System.out.println("test"+key+""+values));
    }
}
