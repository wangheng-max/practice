package method;

import java.util.Scanner;

public class metohd2 {
    static void main(String[] args) {
    int arr[]={1,3,2,1,3};
    int slow=0;
    int fast=0;
    int target=3;
    while (fast<arr.length){
        if(target==arr[fast]){
            fast++;

        }else {
            arr[slow]=arr[fast];
            slow++;
            fast++;
        }
    }
        for (int i = 0; i<slow; i++) {
            System.out.print(arr[i]);

        }

    }
}
