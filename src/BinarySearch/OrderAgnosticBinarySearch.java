package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 150, 56, 26, 12, 8, 6, -6 };
        System.out.println(search(arr, 56));
    }

    private static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target == arr[mid])
                return mid;

            if (isAscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                }
                else if (target < arr[mid])  {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                }
                else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
