//Floor of a number is "greater element which is the less than or equal to the target"

package BinarySearch;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {
            2, 3, 5, 9, 14, 16, 18
        };

        System.out.println("Floor of a number : " + floorOfANumber(arr, 4));
    }

    private static int floorOfANumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
