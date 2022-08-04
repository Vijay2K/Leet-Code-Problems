//Question
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPositionOfElement {
    public static void main(String[] args)
    {
        int[] nums = {
          5, 7, 7, 7, 7, 8, 8, 8, 8, 10
        };

        System.out.println(Arrays.toString(searchRange(nums, 7)));
    }

    private static int[] searchRange(int[] nums, int target)
    {
        int[] result = {-1 , -1 };

        int start = search(nums, target, true);
        int end = search(nums, target, false);

        result = new int[] {
                start, end
        };

        return result;
    }

    private static int search(int[] nums, int target, boolean isFindStartIndex)
    {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(target > nums[mid])
                start = mid + 1;
            else if(target < nums[mid])
                end = mid - 1;
            else
            {
                ans = mid;
                if(isFindStartIndex)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }

        return ans;
    }
}
