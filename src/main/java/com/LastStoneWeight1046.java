import java.util.PriorityQueue;

public class LastStoneWeight1046 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (int stone : stones) {
            maxHeap.add(-stone);
        }
        while (maxHeap.size() > 1) {
            int firstStone = -maxHeap.remove();
            int secondStone = -maxHeap.remove();
            if (firstStone != secondStone) {
                maxHeap.add(-(firstStone - secondStone));
            }
        }
        return maxHeap.isEmpty() ? 0 : -maxHeap.remove();
    }
}
