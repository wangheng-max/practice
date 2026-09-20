package oop;

public class carclass {
   private String brand;
   private int carage;
   static int a=20;
   int b=1000;
    public static class engine{
       String enginebrand;
       //int a=30;
       int age;
       public static void show(){
          // int a=10;
           carclass ca=new carclass();
           System.out.println(ca.a);
           System.out.println(ca.b);
         //  System.out.println(a);
        //   System.out.println(this.a);
       //    System.out.println(carclass.this.a);
       }
   }

    public  engine getinstance(){
        return new engine();
    }
}
