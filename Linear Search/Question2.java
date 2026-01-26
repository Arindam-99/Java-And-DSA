public class Question2 {

    public static void main(String[] args) {

        int[] nums = { 23, 45, 67, 89, -3, 11, 16, 27 };
        int target = 16;

        int index = linearSearchIndex(nums, target);
        System.out.println("Index: " + index);

        Integer element = linearSearchElement(nums, target);
        System.out.println("Element: " + element);

        boolean found = linearSearchExists(nums, target);
        System.out.println("Found: " + found);
    }

    static int linearSearchIndex(int[] arr, int target) {
        if (arr == null || arr.length == 0) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }

        return -1;
    }

    static Integer linearSearchElement(int[] arr, int target) {
        if (arr == null || arr.length == 0) return null;

        for (int element : arr) {
            if (element == target) return element;
        }

        return null;
    }

    static boolean linearSearchExists(int[] arr, int target) {
        if (arr == null || arr.length == 0) return false;

        for (int element : arr) {
            if (element == target) return true;
        }

        return false;
    }
}
