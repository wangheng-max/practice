package demo;

import java.sql.Array;
import java.util.Arrays;

import static java.util.Collections.swap;

public class bubbleSort {

   static void main(String[] args) {
       int arr[]={5,4,1,2,6};
       for (int i = 0; i < arr.length - 1; i++) {
          boolean swapped = false; // 优化：如果某一轮没交换，说明已有序
           for (int j = 0; j < arr.length - 1 - i; j++) {
               if (arr[j]> arr[j + 1]) {
                   swap(arr, j, j + 1);
                  swapped = true;
               }
           }
          if (!swapped) break;
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
