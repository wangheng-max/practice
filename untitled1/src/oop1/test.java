package oop1;

public class test {
    static void main(String[] args) {

        API a=new API() {
            @Override
            public void aaa() {
                System.out.println("aaa");
            }

            @Override
            public void bbb() {

            }
        };
        a.aaa();
    }
}

