package demo1;

import demo.Insert;

import java.util.*;

public class ArraysListdemo1 {
    static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bc");
        list.add("ac");
        list.add("ccc");
        list.add("ddd");

        LinkedList<Integer> list1 =new LinkedList<>();

        for (int i =list.size()-1; i >=0; i--) {
            String str=list.get(i);
            if(str.contains("c")){
                list.remove(i);
            }
        }
        System.out.println(list);

        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            String str=it.next();
            if(str.contains("c"));
                it.remove();
        }
        System.out.println(list);
    }
}
