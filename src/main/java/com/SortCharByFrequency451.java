import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharByFrequency451 {
    public String frequencySort(String s) {
        // Count the occurence on each character
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> (map.get(b) - map.get(a)));
        maxHeap.addAll(map.keySet());

        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char current = maxHeap.poll();
            for (int i = 0; i < map.get(current); i++) {
                result.append(current);
            }
        }
        return result.toString();
    }
}
