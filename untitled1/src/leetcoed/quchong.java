package leetcoed;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class quchong {
    static void main(String[] args) {
        int[] a = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len = getquc(a);
        System.out.println(Arrays.toString(Arrays.copyOf(a, len)));
        System.out.println(Arrays.toString(getlinkquc(a)));
    }
    public static int getquc(int nums[]){
            int slow=0;
        for (int fast = 1; fast <nums.length ; fast++) {
            if(nums[fast]!=nums[slow]){
                nums[++slow]=nums[fast];
            }
        }
        return slow+1;
    }

    public static int [] getlinkquc(int nums[]){
        LinkedHashSet<Integer> set =new LinkedHashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int res[]=new int[set.size()];
        int i=0;
        for(int x:set){
            res[i++]=x;
        }
        return res;
    }
}
