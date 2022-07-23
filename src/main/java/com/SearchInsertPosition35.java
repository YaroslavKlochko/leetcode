public class SearchInsertPosition35 {
    public int searchInsert(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                max = mid - 1;
            }
            if (nums[mid] < target) {
                min = mid + 1;
            }
        }
        if (min > max) {
            return min;
        }
        if (nums[min] <= target) {
            return min + 1;
        }
        return min;
    }
}
