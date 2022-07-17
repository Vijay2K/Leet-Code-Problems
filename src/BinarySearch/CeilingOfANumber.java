//Find the ceiling number in an array
//Ceiling of a number is "smallest element which is the greater than or equal to the target" in an array

package BinarySearch;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        System.out.println("Ceiling of number : " + ceiling(arr, 17));
    }

    private static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[end])
            return -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target == arr[mid]) {
                return target;
            }

            if(target > arr[mid]){
                start = mid + 1;
            } else if(target < arr[mid]) {
                end = mid - 1;
            }
        }

        return arr[start];
    }
}
