package leetcoed;

public class Quicksort {
    static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6, 3};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(java.util.Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;              // 递归终止

        int pivotIndex = partition(arr, low, high); // 分区，返回基准最终位置
        quickSort(arr, low, pivotIndex - 1);  // 排左半部分
        quickSort(arr, pivotIndex + 1, high); // 排右半部分
    }

    // Lomuto 分区：以最右元素为基准
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];   // 选最后一个元素为基准
        int i = low;             // i 指向小于基准区域的边界

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, high);      // 把基准放到正确位置
        return i;                // 返回基准下标
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
