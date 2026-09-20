package demo;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Insert {
    static void main(String[] args) {
        int  arr[]={1,3,5,7,9};
        int arr1[]=new int [arr.length+1];
        int target=20;
        int i=0;

        while (i<arr.length && arr[i]<target){
            i++;
        }
        for (int k = 0; k < i; k++) {
            arr1[k]=arr[k];
        }
        arr1[i]=target;
        for (int j = i; j < arr.length; j++) {
            arr1[j+1]=arr[j];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
