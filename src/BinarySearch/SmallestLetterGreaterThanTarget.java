// Question
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

package BinarySearch;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] chs = {
             'e', 'e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n'
        };

        char target = 'e';
        System.out.println(nextGreatestLetter(chs, target));
    }

    private static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end)
        {
            int mid = start + (end - start) / 2;

            if(target < letters[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return letters[start % letters.length];
    }
}
