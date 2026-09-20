package opp2;

public interface api {
    public abstract void price();

    public  default  void function(){

        System.out.println("默认方法");
    }
    public static  void method1() {
        System.out.println("静态方法");
    }
}
