package LinearSearch;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = { 1, 5, 4, 8, 9 };
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    private static int[] getConcatenation(int[] nums){
        int[] newArr = new int[nums.length * 2];
        int n = nums.length;

        for (int i = 0; i < n; i++)
        {
            newArr[i] = nums[i];
            newArr[i + n] = nums[i];
        }

        return newArr;
    }
}
