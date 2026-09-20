package demo;
import java.util.Arrays;
import  java.util.Scanner;
public class demo1 {
     static void main(String[] args) {
     /*   for (int i = 0; i < 4; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(
                    "请输入数字"
            );
            int a = scanner.nextInt();
            int b = 2;
            System.out.println("a" + "b");
            if (a / 100 < 10) {
                if (a % 3 == 0) {
                    System.out.println("a是被3整除的整数");
                }

            } else
                System.out.println("请重新输入三位数");
        }
        */
         //选择排序法
        int arr[] = {1, 2, 5, 3, 2, 1, 7};
        for (int i = 0; i < arr.length; i++) {
            int minidex=i;
            for (int j = i+1; j < arr.length ;j++) {
                if(arr[minidex]>arr[j]){
                    minidex=j;
                }
            }if (minidex!=i){
                swap(arr,minidex,i);
            }
        }
         System.out.println(Arrays.toString(arr));
    }
    private static void swap(int[] arr, int j, int i) {
        int t=0;
        t=arr[j];
        arr[j]=arr[i];
        arr[i]=t;

    }
}
