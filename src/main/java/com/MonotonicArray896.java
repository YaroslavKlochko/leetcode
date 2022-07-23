import java.util.Arrays;

// create pointers
// iterate and check conditions
// return modified results

public class MonotonicArray896 {

    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                increasing = false;
            }
            if (nums[i] < nums[i + 1]) {
                decreasing = false;
            }
        }
        return increasing || decreasing;
    }
}
