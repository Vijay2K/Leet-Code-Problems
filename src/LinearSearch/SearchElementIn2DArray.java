package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElementIn2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target;

        int[][] arr = {
                {20, 30, 40},
                {100, 50, 60, 90},
                {24, 896},
                {5}
        };

        System.out.print("\nEnter the target : ");
        target = in.nextInt();

        System.out.println(target + " have been found at the index : "
                + Arrays.toString(SearchIn2DArr(arr, target)));
        System.out.println("Max number in a 2D array : " + SearchMaxIn2DArr(arr));
    }

    private static int SearchMaxIn2DArr(int[][] arr){
        int max = Integer.MIN_VALUE;

        for (int[] i : arr){
            for (int j : i){
                if(j > max){
                    max = j;
                }
            }
        }

        return max;
    }

    private static int[] SearchIn2DArr(int[][] arr, int target){
        int[] result = null;

        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] == target){
                    result = new int[]{
                            row, col
                    };
                }
            }
        }

        if(result == null) {
            System.out.println(target + " haven't found");
            return null;
        }

        return  result;
    }
}
