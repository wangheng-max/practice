package leetcoed;

import java.util.Arrays;

public class removeval {
    static void main(String[] args) {
        int nums[]={1,2,2,2,6,6,7};
        System.out.println(Arrays.toString(removeVal(nums,2)));

    }
    public static int[] removeVal(int[] nums, int val){
        int slow=0;
        for(int fast=0;fast<nums.length;fast++){
            if(nums[fast]!=val){
                nums[slow++]=nums[fast];
            }
        }
        return Arrays.copyOf(nums,slow);
    }
}
