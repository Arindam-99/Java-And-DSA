import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;

        k = k % n;
        if (k == 0) return;

        reverse(nums, 0, n - 1);      // reverse whole array
        reverse(nums, 0, k - 1);      // reverse first k elements
        reverse(nums, k, n - 1);      // reverse remaining elements
    }

    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums)); // [5, 6, 7, 1, 2, 3, 4]
    }
}
