package opp1;

public class benke extends student{
    int grade;

    public benke() {
    }

    public benke(String name, String id, int age,int grade) {
        super(name, id, age);
        this.grade=grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public void study() {
       // super.study();
        System.out.println("学习本科");
    }
    @Override
    public void eat(){
        System.out.println("wozaichif");
    }
}
