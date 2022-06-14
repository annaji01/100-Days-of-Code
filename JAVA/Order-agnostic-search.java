// Find the element in given sorted array

class Main {
  public static void main(String[] args) {
    // int[] arr = { 78, 65, 54, 32, 12, 11, 6, 5, 3, 1 };
    int[] arr = { 1, 2, 3, 4, 5, 6, 78, 89, 99, 120 };

    int target = 78;

    int bs = binarySearch(arr, target);

    System.out.println(bs);

  }

  static int binarySearch(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (arr[1] >= arr[2]) {
        if (target < arr[mid]) {
          start = mid + 1;
        } else if (target > arr[mid]) {
          end = mid - 1;
        } else {
          System.out.print("Your element is present on index :- ");
          return mid;
        }
      } else {
        if (target > arr[mid]) {
          start = mid + 1;
        } else if (target < arr[mid]) {
          end = mid - 1;
        } else {
          System.out.print("Your element is present on index :- ");
          return mid;
        }
      }
    }
    System.out.print("Target is not present into the array ");
    return -1;
  }
}