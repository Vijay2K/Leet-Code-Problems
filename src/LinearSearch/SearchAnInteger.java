package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchAnInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = { 12, 54, 87, -96 };

        System.out.println("Given Array");
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the search target : ");
        int target = in.nextInt();

        if (HaveFoundTheTarget(arr, target)){
            System.out.println(target + " have found in an array");
        }
        else {
            System.out.println(target + " haven't found in an array");
        }
    }

    private static boolean HaveFoundTheTarget(int[] arr, int target){
        if (arr.length == 0)
            return false;

        for(int a : arr){
            if (a == target)
                return true;
        }

        return  false;
    }
}
