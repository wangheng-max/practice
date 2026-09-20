package demo;

import java.lang.classfile.instruction.SwitchCase;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class demo2 {
    static void main(String[] args) {
       /* Scanner scanner=new Scanner(System.in);
        int week= scanner.nextInt();
        String name= switch(week){
            case 1-> {
                yield "1";
            }
            default -> {
                yield "2";
            }
        };
        System.out.println(name);
*/
        int arr[]={1,2,5,3,2,1,7};
      /*  for(int i=0;i<arr.length-1;i++){
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int t;
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }

       */
        //插入排序
        for (int i = 1; i < arr.length; i++) {
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println(Arrays.toString(arr));
    }

}
