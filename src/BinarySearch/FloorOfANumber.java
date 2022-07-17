//Find a floor number in an array
//Floor of a number is "greater element which is the less than or equal to the target" in an array

package BinarySearch;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {
            2, 3, 5, 9, 14, 16, 18
        };

        System.out.println("Floor of a number : " + floor(arr, 4));
    }

    private static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[end])
            return -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target == arr[mid])
                return target;

            if(target > arr[mid])
                start = mid + 1;
            else if(target < arr[mid])
                end = mid - 1;
        }

        return arr[end];
    }
}
