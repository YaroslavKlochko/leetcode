import java.util.List;

public class MaxLengthOfConcatenatedChars1239 {
    public int maxLength(List<String> arr) {
        int[] result = new int[1];
        maxUniqueString(arr, 0, "", result);
        return result[0];
    }

    private void maxUniqueString(List<String> arr, int index, String current, int[] result) {
        if (index == arr.size() && countUniqueChars(current) > result[0]) {
            result[0] = current.length();
            return;
        }
        if (index == arr.size()) {
            return;
        }
        maxUniqueString(arr, index + 1, current, result);
        maxUniqueString(arr, index + 1, current + arr.get(index), result);

    }

    private int countUniqueChars(String current) {
        int[] counts = new int[26];
        for (char c : current.toCharArray()) {
            if (counts[c - 'a']++ > 0) {
                return -1;
            }
        }
        return current.length();
    }
}
