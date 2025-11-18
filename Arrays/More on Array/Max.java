public class Max {
  public static void main(String[] args) {
    int[] arr = { 1, 23, 45, 67, 88 };
    System.out.println(maxRange(arr, 1, 3));
    System.out.println(max(arr));

    swap(arr); // reverse array
    for (int n : arr) {
      System.out.print(n + " ");
    }
  }

  // Work on edge cases here, like array being null
  static int maxRange(int[] arr, int start, int end) {

    if (end < start) {   // FIX: end must be >= start
      return -1;
    }

    int maxVal = arr[start];
    for (int i = start; i <= end; i++) {
      if (arr[i] > maxVal) {
        maxVal = arr[i];
      }
    }
    return maxVal;
  }

  static int max(int[] arr) {
    if (arr.length == 0) {
      return -1;
    }

    int maxVal = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > maxVal) {
        maxVal = arr[i];
      }
    }
    return maxVal;
  }

  // -----------------------------------
  // Reverse array (requires a 2-index swap)
  // -----------------------------------
  static void swap(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      swap(arr, start, end); // call correct swap function
      start++;
      end--;
    }
  }

  // Proper swap method with two indexes
  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
