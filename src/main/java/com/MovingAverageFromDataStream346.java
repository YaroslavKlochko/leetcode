import java.util.LinkedList;
import java.util.Queue;

public class MovingAverageFromDataStream346 {
    private Queue<Integer> queue;
    private int maxSize;
    private double sum;

    public MovingAverageFromDataStream346(int size) {
        queue = new LinkedList<>();
        maxSize = size;
        sum = 0;
    }

    public double next(int val) {
        if (queue.size() == maxSize) {
            sum -= queue.remove();
        }
        queue.add(val);
        sum += val;
        return sum / queue.size();
    }
}
