import java.util.Arrays;

// create a box
// increase the speed of array
// iterate and check

class missingNumber268_1 {

    public int findMissingNumber(int[] nums) {
        Arrays.sort(nums);
        int missingValue = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return missingValue;
    }
}