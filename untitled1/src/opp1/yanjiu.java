package opp1;

public class yanjiu extends student{


    public yanjiu() {
    }

    public yanjiu(String name, String id, int age) {
        super(name, id, age);
    }
    @Override
    public void study(){
      //  super.study();
        System.out.println("学习研究生知识");
    }

}
