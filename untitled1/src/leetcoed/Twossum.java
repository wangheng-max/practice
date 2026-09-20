package leetcoed;

import java.util.Arrays;
import java.util.HashMap;

public class Twossum {
    static void main(String[] args) {
            int nums[]={1,2,5,6};
            int target=7;
        System.out.println(Arrays.toString(getsum(nums,target)));
    }

    public static int[] getsum(int nums[],int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        int temp;
        for (int i = 0; i < nums.length; i++) {
            temp=target -nums[i];
            if(map.containsKey(temp)){
                return new int[]{map.get(temp),i};
            }
            map.put(nums [i],i);
        }
        return new int[]{-1,-1};
    }

}
