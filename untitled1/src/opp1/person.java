package opp1;

public class person {
    private String name="wda";
    private String id;
    int age;

    public person() {
    }

    public person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }
    public void eat(){

        System.out.println("im eating");
    }
    public void sleep(){
        System.out.println("im sleeping");
        
    }
    public void study(){
        System.out.println("zaixuexi");
    }
}
