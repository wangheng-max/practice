package demo;

import java.util.Arrays;
import java.util.Random;

public class demo5 {
    static void main(String[] args) {
      /*  int money=300;
        int n=5;
        Random random =new Random();
        for (int i = 1; i <=n-1; i++) {
            int mymoney=random.nextInt(money-(n-i))+1;
            money=money-mymoney;
            System.out.println("第"+i+"个人签到了"+mymoney);
        }
        System.out.println("last"+money);
*/

        //qiucksort
        int arr1[]={1,3,5,7};
        int arr2[]={2,4,6,8,10};
        int l=arr1.length+arr2.length;
        int arr3[]=new int [l];
        int i=0,j=0,k=0;
        while (i<arr1.length && j<arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                k++;
                i++;
            } else {
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }
            while (i<arr1.length){
                arr3[k++]=arr1[i++];

            }
            while (j<arr2.length){
                arr3[k++]=arr2[j++];
            }
        int medium=arr3.length/2;
        System.out.println(arr3[medium]);
        System.out.println(Arrays.toString(arr3));
    }
}
