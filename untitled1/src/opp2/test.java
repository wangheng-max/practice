package opp2;

public class test {
    static void main(String[] args) {
        person per =new person();
        bicycle bi=new bicycle();
        bi.setBrand("phillp");
        realcar car=new realcar();
        per.drive(bi);
        car.setBrand("tsla");
        per.drive(car);
        car.price();
        car.function();
        api.method1();
    }
}
