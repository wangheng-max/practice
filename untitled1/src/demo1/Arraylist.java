package demo1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Arraylist {
    static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11227);
        list.add(12);
        list.add(125);
        list.remove(1);
        list.add(0,8);
        //list.remove;
        list.set(1,5);
        list.get(1);
        System.out.println(list.subList(2,3));
        System.out.println(list);

        //迭代器
        Iterator<Integer> it=list.iterator();
        while (it.hasNext()){
            Integer a=it.next();
            System.out.println(a);
        }
        //多态
        Collection<String> coll=new ArrayList<>();
        coll.add("add");
        coll.add("ads");
        coll.add("adg");
        //增强for
        for (String s : coll) {
            System.out.println(s);
            s="qqq";
        }
        System.out.println(coll);


        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //lambda表达式
        coll.forEach( s ->System.out.println(s));
    }

}
