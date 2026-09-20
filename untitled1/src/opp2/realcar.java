package opp2;

public class realcar extends  car implements api{
    public realcar() {
    }

    public realcar(String brand, double speed) {
        super(brand, speed);
    }
    @Override
    public  void voice(){
        System.out.println("honk");
    }

    @Override
    public void price() {
        System.out.println("car的价格是啥");
    }

//    public void method1(){
//        System.out.println("静态方法被调用");
//    }
}
