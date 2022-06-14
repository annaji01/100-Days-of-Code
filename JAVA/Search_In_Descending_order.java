// Find the element into the array which is sorted into the descending order

class Main {
  public static void main(String[] args) {
    int[] arr = { 78, 65, 54, 32, 12, 11, 6, 5, 3, 1 };

    int target = 1;

    int bs = binarySearch(arr, target);

    System.out.println(bs);

  }

  static int binarySearch(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      // Find the middle element
      int mid = start + (end - start) / 2;

      if (target < arr[mid]) {
        start = mid + 1;
      } else if (target > arr[mid]) {
        end = mid - 1;
      } else {
        System.out.print("Your element is present on index :- ");
        return mid;
      }
    }
    System.out.print("Target is not present into the array ");
    return -1;
  }
}