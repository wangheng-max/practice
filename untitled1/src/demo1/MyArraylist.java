package demo1;

import java.util.ArrayList;

public class MyArraylist <E>{
    private ArrayList list=new ArrayList();

    public boolean add(E e){
        list.add(e);
        return true;
    }
    @Override
    public String toString() {
        return list.toString();
    }
}
