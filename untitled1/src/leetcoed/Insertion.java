package leetcoed;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Insertion {
    static void main(String[] args) {
        int nums[]={3,2,1,7,8887};
        System.out.println(Arrays.toString(intsertion(nums)));
    }

    public static int [] intsertion(int nums[]){
        for (int i = 1; i < nums.length; i++) {
            int key=nums[i];
            int j=i-1;
            while (j>=0 &&nums[j]>key){
                    nums[j+1]=nums[j];
                    j--;
            }
            nums[j+1]=key;
        }
        return nums;
    }
}
