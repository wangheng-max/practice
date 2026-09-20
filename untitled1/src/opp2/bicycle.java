package opp2;

public class bicycle extends car{
    public bicycle() {
    }

    public bicycle(String brand, double speed) {
        super(brand, speed);
    }
    @Override
    public void voice(){
        System.out.println("ringbell");
    }
}

