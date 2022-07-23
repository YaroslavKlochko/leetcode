import java.util.HashMap;

public class FruitIntoBaskets904 {
    public int totalFruit(int[] fruits) {
        if (fruits == null || fruits.length == 0) {
            return 0;
        }
        int max = 1;
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        while (j < fruits.length) {
            if (map.size() <= 2) {
                map.put(fruits[j], j++);
            }
            if (map.size() > 2) {
                int min = fruits.length - 1;
                for (int value : map.values()) {
                    min = Math.min(min, value);
                }
                i = min + 1;
                map.remove(fruits[min]);
            }
            max = Math.max(max, j - i);
        }
        return max;
    }
}
