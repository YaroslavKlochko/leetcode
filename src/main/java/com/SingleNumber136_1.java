import java.util.HashMap;
import java.util.Map;

public class SingleNumber136_1 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.remove(num);
            }
        }
        for (Map.Entry<Integer, Integer> key : map.entrySet()) {
            return key.getKey();
        }
        return -1;
    }

    public int singleNumberTest(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.remove(nums[i]);
            }
        }
        for (Map.Entry<Integer, Integer> key : map.entrySet()) {
            return key.getKey();
        }
        return -1;
    }
}
