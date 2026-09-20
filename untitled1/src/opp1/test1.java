package opp1;

public class test1 {

    static void main(String[] args) {
            benke n1=new benke();
            n1.age=11;
            n1.setName("whh");
            n1.getName();
        System.out.println(n1.getAge());
            n1.study();
            yanjiu n2=new yanjiu("whhj","11",21);
            n2.study();
            n1.grade=1;
        System.out.println(n1.grade);

            person per=new benke();
            benke z=(benke)per;
            per.eat();
            per.study();
           System.out.println( per.getName() );

    }
}

