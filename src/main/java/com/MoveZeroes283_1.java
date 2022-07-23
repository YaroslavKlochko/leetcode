// check 2 base cases
// create pointer
// iterate and insert all non-zero elements
// iterate and insert all zeroes

public class MoveZeroes283_1 {


    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    public void moveZeroes0(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            } else {
                nums[index++] = nums[i];
                nums[i] = 0;
            }
        }
    }

    public void moveZeroes2(int[] nums) {

        //if only 1 element is present, return
        if (nums.length == 1)
            return;

        int i = 0;

        //iterate through the array counting number of zeros
        for (int zero : nums) {
            if (zero == 0)
                i++;
        }

        //if no 0's exists or array only contains zeros , return
        if (i == 0 || i == nums.length)
            return;

        //index to keep track of non-zero elements
        int m = 0;

        //for loop to move all the non zero elements in order
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0)
                nums[m++] = nums[j];
        }

        //insert the 0's in remaining spaces up till the end
        for (int j = nums.length - i; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
