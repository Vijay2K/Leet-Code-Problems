package LinearSearch;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = { 12,345,2,6,7896 };
        System.out.println(findNumbers(arr));
    }

    private static int findNumbers(int[] nums){
        int count = 0;
        for (int n : nums){
            int num = CountDigits(n);
            if (num % 2 == 0){
                count++;
            }
        }
        return count;
    }

    private static int CountDigits(int num){
        if (num < 0)
            return -1;

        if (num == 0)
            return 1;

        int count = 0;
        while (num > 0){
            num /= 10;
            count++;
        }
        return count;
    }
}
