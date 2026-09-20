package demo1;

import java.util.*;

public class SetDemo1 {
    static void main(String[] args) {
        Set<String> set= new LinkedHashSet<>();//有序添加，不重复
        Set<String> set1=new HashSet<>();//添加无序
        set.add("aad");
        set.add("aad");
        set1.add("aaa");
        set1.add("aaa");
        System.out.println(set1);
        System.out.println(set);

        Student stu1=new Student("zs",22);
        Student stu2=new Student("wu",21);
        Student stu3=new Student("zs",22);
        Student stu4=new Student("zs",47);
      //  Set<Student> stu=new HashSet<>();
        Set<Student> stu=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getId()-o1.getId();
            }
        });
        stu.add(stu1);
        stu.add(stu2);
        stu.add(stu3);
        stu.add(stu4);

        System.out.println(stu);


    }
}
