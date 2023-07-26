import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueNumOfOccurrences1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int a : arr)
            count.put(a, 1 + count.getOrDefault(a, 0));
        return count.size() == new HashSet<>(count.values()).size();
    }
}
