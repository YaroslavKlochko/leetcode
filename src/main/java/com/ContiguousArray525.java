
import java.util.HashMap;

public class ContiguousArray525 {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0, -1);

        int maxLength = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count -= 1; //(+= -1)
            } else {
                count += 1;
            }
            if (counts.containsKey(count)) {
                maxLength = Math.max(maxLength, i - counts.get(count));
            } else {
                counts.put(count, i);
            }
        }
        return maxLength;
    }
}
