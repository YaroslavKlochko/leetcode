
import java.util.HashMap;

// create a box to count elements and add all of them to the box
// iterate the biggest str and check for redundant element

public class FindDifference389 {

    public static char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return c;
            } else {
                map.put(c, map.get(c) - 1);
            }
        }
        return '.';
    }

    public static void main(String[] args) {

        findTheDifference("abc", "abcd");
    }
}
