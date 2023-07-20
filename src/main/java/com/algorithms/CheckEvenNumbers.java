package algorithms;

public class CheckEvenNumbers {
    public int findNumbers(int[] nums) {
        int counter = 0;
        for (int num : nums) {
            if (evenChecker(num)) {
                counter++;
            }
        }
        return counter;
    }

    public boolean evenChecker(int value) {
        char[] array = Integer.toString(value).toCharArray();
        return array.length % 2 == 0;
    }
}
