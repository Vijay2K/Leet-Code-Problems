package LinearSearch;

import java.util.Arrays;

public class SearchMinNumber {
    public static void main(String[] args) {
        int[] arr = { 12, 58, 100, 92, 2, 50 };
        System.out.println("Given Array");
        System.out.println(Arrays.toString(arr));
        int resultNum = FindMin(arr);
        System.out.println("Min Number in an array : " + resultNum);
    }

    private static int FindMin(int[] arr){
        int min = arr[0];
        for (int a : arr){
            if (a < min)
            {
                min = a;
            }
        }
        return min;
    }
}
