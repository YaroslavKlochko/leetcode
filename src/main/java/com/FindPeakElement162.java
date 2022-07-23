
// create 2 pointers
// iterate
// use binary search

public class FindPeakElement162 {

    int findPeak(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public int findPeakElement(int[] nums) {
        //binary search
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int midPoint = left + (right - left) / 2;
            if (nums[midPoint] < nums[midPoint + 1]) {
                left = midPoint + 1;
            } else {
                right = midPoint;
            }
        }
        return left;
    }
}
