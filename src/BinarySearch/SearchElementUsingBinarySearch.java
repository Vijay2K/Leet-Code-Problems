package BinarySearch;

public class SearchElementUsingBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 8 , 15, 25, 36, 89, 120 };
        int target = 120;
        System.out.println(Search(arr, target));
    }

    private static int Search(int[] arr, int target)
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
}
