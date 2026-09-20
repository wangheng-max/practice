package leetcoed;

import demo.Insert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Threesun {
    static void main(String[] args) {
            int nums[]={-1,0,1,2,-1,-4};
        System.out.println(threesum(nums,0));
        System.out.println(threesum(nums,0).size());
    }

    public static List<List<Integer>> threesum(int nums[],int target){
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for (int i = 0; i < n-2; i++) {
            if(nums[i]>0)break;
            if(i>0 && nums[i]==nums[i-1])continue;
            target=-nums[i];
            int left=i+1;int right=n-1;
            while (left<right){
                int sum=nums[left]+nums[right];
                if(sum==target){
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left<right && nums[left]==nums[left+1])left++;
                    while (left<right && nums[right]==nums[right-1])right--;
                    left++;
                    right--;
                } else if (sum<target) {
                    left++;
                }else {
                    right--;
                }
            }
        }
        return list;
    }
}
