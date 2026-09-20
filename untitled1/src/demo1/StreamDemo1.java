package demo1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {
    static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bc");
        list.add("ac");
        list.add("ccc");
        list.add("ddd");

        List<Double> list1=new ArrayList<>();
        list1.add(11.2);
        list1.add(14.2);
        list1.add(1.2);
        list1.add(41.2);
        list1.stream().sorted((s1,s2)->Double.compare(s2,s1)).forEach(System.out::println);
        System.out.println("---==");
        list1.stream().filter(s->s>20).forEach(System.out::println);
        System.out.println("-------");
        Optional<Double> max = list1.stream().max((s1, s2) -> Double.compare(s1, s2));
        System.out.println(max.get() );
        List<String> a = list.stream().filter(s -> s.contains("a")).toList();
        System.out.println(a);
      //  Map<> map=new LinkedHashMap<>();

        Student stu1=new Student("zs",24);
        Student stu2=new Student("wu",21);
        Student stu3=new Student("zw",22);
        Student stu4=new Student("zl",47);
        List<Student> list2=new ArrayList<>();
        list2.add(stu1);
        list2.add(stu2);
        list2.add(stu3);
        list2.add(stu4);

        Collections.addAll(list2);
        Map<Integer, String> collect = list2.stream().collect(Collectors.toMap(Student::getId, Student::getName));
        System.out.println(collect);




    }
}
