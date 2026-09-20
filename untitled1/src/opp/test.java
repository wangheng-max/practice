package opp;

public class test {
    static void main(String[] args) {
        student s=new student();
        s.setNumber(11);
       // s.getNumber() ;

        s.getname();

        express e=express.a;
        System.out.println(e.getName());
        express arr[]=express.values();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
       // System.out.println(s.stu);
      //  System.out.println(s.cd);
       // System.out.println(s.age);
        System.out.println(s.name);
        System.out.println(s.getNumber() );
    }
}
