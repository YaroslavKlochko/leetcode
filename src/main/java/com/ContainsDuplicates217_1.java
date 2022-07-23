
import java.util.*;

// we are looking for duplicates and we mustn't count them
// check if contains duplicate
// so, add all duplicates

public class ContainsDuplicates217_1 {

    boolean conDuplMap(int[] nums) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int num : nums) {
            numbers.put(num, numbers.getOrDefault(num, 0) + 1);
            if (numbers.get(num) == 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean containDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (numbers.contains(nums[i])) {
                return true;
            }
            numbers.add(nums[i]);
        }
        return false;
    }

//----------------------------------------------------------------------------------------------------

    public boolean containsDuplicates1(int[] nums) {
        Arrays.sort(nums); //
        for (int i = 2; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

//----------------------------------------------------------------------------------------------------

    public static boolean containsDuplicates(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7, 99};
        System.out.println(containDuplicate(nums));
    }
}

