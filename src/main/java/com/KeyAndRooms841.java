import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class KeyAndRooms841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visitedRooms = new HashSet<>();
        visitedRooms.add(0);

        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        while (!stack.isEmpty()) {
            List<Integer> keys = rooms.get(stack.pop());
            for (int key : keys) {
                if (!visitedRooms.contains(key)) {
                    visitedRooms.add(key);
                    stack.add(key);
                }
            }
        }
        return rooms.size() == visitedRooms.size();
    }
}
