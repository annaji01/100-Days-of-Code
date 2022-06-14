class Main {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 4, 5, 7, 8, 23, 56, 78 };

    int target = 36;

    int bs = binarySearch(arr, target);

    System.out.println(bs);

  }

  static int binarySearch(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      // Find the middle element
      int mid = start + (end - start) / 2;

      if (target > arr[mid]) {
        start = mid + 1;
      } else if (target < arr[mid]) {
        end = mid - 1;
      } else {
        System.out.print("Your element is present on index :- ");
        return mid;
      }
    }
    System.out.print ("Target is not present into the array ");
    return -1;
  }
}