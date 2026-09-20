package opp;

public enum express {
    a(1),b(12);

    private int name;

    express(int name) {
        this.name=name;
    }

    express() {
    }
    public int getName(){
        return name;
    }
}
