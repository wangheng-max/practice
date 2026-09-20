package demo;

import java.util.Arrays;

public class demo4 {
    static void main(String[] args) {
        int arr[]={1,2,3,4};
        int slow=0;
        int fast=arr.length-1;
        int target=6;
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = i+1; i1 < arr.length; i1++) {
                if(arr[i]+arr[i1]==target) {
                    System.out.println("前"+i +"后"+ i1);

                }

            }


        }
    }

    }

