package demo;

import java.util.Arrays;

public class hebin {
    static void main(String[] args) {
        int arr1[]={1,3,5,7};
        int arr2[]={2,4,6,8,10};
        int l=arr1.length+arr2.length;
        int arr3[]=new  int [l];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                arr3[k]=arr1[i];
                k++;
                i++;

            }else {
                arr3[k]=arr2[j];
                k++;
                j++;
            }
        }
        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }

        // 4. 如果 arr2 还有剩余，全部拷贝过去
        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
