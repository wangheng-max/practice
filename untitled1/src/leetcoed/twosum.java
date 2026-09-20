package leetcoed;
 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next;
    }
}
public class twosum {
     static void main(String[] args) {
            int nums[]={3,1,2,5,6,4};
         int k=0;
         int kthLargest = findKthLargest(nums, k);
         System.out.println(kthLargest);


     }
     public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
         ListNode l3 = new ListNode(0);
         while (l3.next != null) {
             int sum = 0;
             if (l1.val + l2.val >= 10) {
                 sum = (l1.val + l2.val) % 10;
                 l3.val = sum;
                 l3.next.val = l3.next.val + 1;
             }

         }
         return l3;
     }
    public  static int findKthLargest(int[] nums, int k) {
        int temp=nums[0];
        int slow=0;
        int fast=nums.length-1;
        while(slow<fast){
            if(nums[slow]<nums[fast]){
                fast--;

            }
            if(nums[slow]>nums[fast]){
                nums[slow]=nums[fast];
                slow++;
            }
            if(nums[slow]<temp){
                nums[fast]=temp;

            }
            temp=nums[slow];
        }
        return nums[k];
    }
 }
