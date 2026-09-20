package leetcoed;

import java.util.Arrays;

public class Merged {
    static void main(String[] args) {
        int nums1[]={1,3,5,7};
        int nums2[]={2,4,6,8};
        System.out.println(Arrays.toString(merged(nums1,nums2)));

        System.out.println(merged2(nums1,nums2,4,2));

    }
    public static int [] merged(int nums1[],int nums2[]){
        int n=nums1.length-1;
        int m=nums2.length-1;
        var k=nums1.length+nums2.length-1;
        int nums3[]=new int[nums1.length+nums2.length];
        while (n >= 0 && m >= 0) {
            if (nums1[n] > nums2[m]) {
                nums3[k--] = nums1[n--];
            } else {
                nums3[k--] = nums2[m--];
            }
        }
        while (n >= 0) nums3[k--] = nums1[n--];
        while (m >= 0) nums3[k--] = nums2[m--];
        return nums3;
    }
    public static String merged2(int nums1[],int nums2[],int n,int m){
        int i=n-1;
        int j=m-1;
        int k=m+n-1;
        int nums3[]=new int[n+m];
        while (j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums3[k--]=nums1[i--];
            }else {
                nums3[k--]=nums2[j--];
            }
        }
        while (i>=0)nums3[k--]=nums1[i--];
        return Arrays.toString(nums3);
    }
}
