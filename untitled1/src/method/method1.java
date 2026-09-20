package method;

import java.util.Arrays;
import java.util.Random;

public class method1 {
    static void main(String[] args) {
            int a=10;
            int b=-20;
        getnum();

    }
    public  static  void getnum() {
        Random random = new Random();
        int arr[] = new int[10];
        for (int i = 0; i < 10;) {
            int r = random.nextInt(10) + 1;
            int count=0;
            for (int j = 0; j < arr.length; j++) {

                if(arr[j]==r){
                    count++;
                    break;
                }
            }
            if(count==0) {
                arr[i] = r;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        }

    }

