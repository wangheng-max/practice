package demo1;

public class binarysearch {
    static void main(String[] args) {
        int arr[] = {1, 42, 57, 87, 89, 96, 107, 109, 150};
        int maxindex = arr.length - 1;
        int minindex = 0;
        int midlleindex=0;
        int target = 888;
        boolean flag=true;
        while (flag) {
            midlleindex = (maxindex + minindex) / 2;
            if (arr[midlleindex] > target) {
                maxindex = midlleindex - 1;
            } else if (arr[midlleindex]<target){
                minindex = midlleindex + 1;
            }
             if(arr[midlleindex]==target){
                flag=false;
            }
             if(maxindex<minindex){
                 System.out.println("数字不存在");
                 break;
             }
        }
        System.out.println(midlleindex);
    }
}
