
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// a box to missing number
// we are working with unique elements and we need to add them
// iterate and find missing number

public class DisappearedNumbers448_1 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<>();
        Set<Integer> numbers = new HashSet<>();
        for (int i : nums) {
            numbers.add(i);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!numbers.contains(i)) {
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }
}
