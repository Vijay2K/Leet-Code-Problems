//Finding an element in a sorted array using binary search

package BinarySearch;

public class SearchElementUsingBinarySearch {
    public static void main(String[] args) {
        int[] arr_asc = { 2, 6, 8 , 15, 25, 36, 89, 120 };
        int[] arr_des = { 95, 85, 56, 39, 20, 12, 11, 8, 6, -2 };

        System.out.println("Ascending search : " + search_ascending(arr_asc, 25));
        System.out.println("Descending search : " + search_decreasing(arr_des, 56));
    }

    private static int search_ascending(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end)
        {
            int mid = (start + end) / 2;
            if (target < arr[mid])
            {
                end = mid - 1;
            } else if(target > arr[mid])
            {
                start = mid + 1;
            }

            if (arr[mid] == target)
                return mid;
        }

        return -1;
    }

    private static int search_decreasing(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target > arr[mid])
            {
                end = mid - 1;
            }
            else if (target < arr[mid])
            {
                start = mid + 1;
            }

            if (target == arr[mid])
                return mid;
        }

        return -1;
    }
}
