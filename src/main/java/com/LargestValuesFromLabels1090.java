import com.company.algorithms.dataStructures.Item;

import java.util.*;

public class LargestValuesFromLabels1090 {
    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < labels.length; i++) {
            items.add(new Item(values[i], labels[i]));
        }

        PriorityQueue<Item> maxHeap = new PriorityQueue<>((Item a, Item b) -> b.value - a.value);
        maxHeap.addAll(items);

        Map<Integer, Integer> counts = new HashMap<>();
        int value = 0;
        while (!maxHeap.isEmpty() && numWanted > 0) {
            Item current = maxHeap.remove();
            counts.put(current.label, counts.getOrDefault(current.label, 0) + 1);
            if (counts.get(current.label) <= useLimit) {
                value += current.value;
                numWanted--;
            }
        }
        return value;
    }
}

