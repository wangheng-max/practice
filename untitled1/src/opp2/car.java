package opp2;

public class car {
    private String brand;
    private double speed;
    public car(){

    }
    public car(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public void move(){
        System.out.println("car在动");

    }
    public void voice(){
        System.out.println("car响");
    }
}
