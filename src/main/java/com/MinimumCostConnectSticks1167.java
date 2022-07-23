import java.util.PriorityQueue;

public class MinimumCostConnectSticks1167 {
    public int connectSticks(int[] sticks) {
        int cost = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int stick : sticks) {
            minHeap.add(stick);
        }
        while (minHeap.size() > 1) {
            int sum = minHeap.remove() + minHeap.remove();
            cost += sum;
            minHeap.add(sum);
        }
        return cost;
    }
}
