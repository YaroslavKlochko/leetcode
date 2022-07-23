// create pointers and starting point
// go over all elements and get sum
// find min and max element
// return maxValue

public class MaxSubarray53_1 {

    int maxSubarray(int[] nums) {
        int min = 0;
        int max = nums.length > 0 ? nums[0] : 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            min = Math.min(min, sum);
            max = Math.max(max, sum - min);
            if (max < 0) {
                return max;
            }
        }
        return max;
    }

    int maxSubArray0(int[] nums) {
        int min = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, sum - min);
        }
        return max;
    }

    public int maxSubArray(int[] nums) {
        int min = 0;
        int sum = 0;
        int max = nums[0];
        for (int num : nums) {
            sum += num;
            min = Math.min(sum, min);
            max = Math.max(max, sum - min);
        }
        return max;
    }

}
