package demo1;

public class Recursiondemo1 {
    static void main(String[] args) {
        System.out.println(getnum(5));
    }
    public static int getnum(int n){
        if(n==1){
            return 1;
        }else {
            return getnum(n-1)*n;
        }
    }
}
