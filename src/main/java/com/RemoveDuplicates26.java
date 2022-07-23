import java.util.Arrays;

public class RemoveDuplicates26 {

    int removeDuplicates(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                nums[counter++] = nums[i];
            }
        }
        return counter;
    }
}
