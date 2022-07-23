import java.util.HashMap;

// check base case
// create 2 pointers
// iterate and get the target sum and check conditions
// create input

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 4};
        int target = 9;
        twoSum(arr, target);
    }

    public static int[] twoSum(final int[] nums, final int target) {
        final Map<Integer, Integer> hashMap = new HashMap<>();
        int i = 0;
        while ((i < nums.length) && (hashMap.get(nums[i]) == null)) {
            hashMap.put(target - nums[i], i);
            i++;
        }
        if (i < nums.length) {
            return new int[]{hashMap.get(nums[i]), i};
        }
        return new int[]{};
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int arr[] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int ele = target - nums[i];

            if (map.containsKey(ele)) {
                arr[0] = i;
                arr[1] = map.get(ele);
                break;
            }
            map.put(nums[i], i);
        }
        return arr;
    }
}
