package demo;

import org.w3c.dom.ls.LSOutput;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class demo3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入项数");
        int i = scanner.nextInt();
        int j= scanner.nextInt();
        int sum = 0;
        Random r=new Random();
        int c=r.nextInt(10+1)+20;
        while (c!=i){
            i++;

        }
        System.out.println("随机数是"+i);
        for(int k=3;k<=10;k++){
            sum=i+j;
            i=j;
            j=sum;

        }

        for (int n = 1; n <= i; n++) {

            sum += Math.pow(-1 ,n +1) * n;

        }
        System.out.println(sum);
        int arr[]={1,2,3};
        int sum1=0;
        for (int k = 0; k < arr.length; k++) {
            sum1+=arr[k];
        }

        System.out.println(sum1);
        int length=10;
        int arr1[]=new int[length];
        int max=arr1[0];;
        for (int l = 0; l < 10; l++) {
           arr1[l]=r.nextInt(6)+1;

           if(max<arr1[l]){
               max=arr1[l];
           }
        }
        System.out.println("最大值是"+max);
        System.out.println("生成的随机数组是"+ Arrays.toString(arr1));
    }

}
