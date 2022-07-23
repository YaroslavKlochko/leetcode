// create pointers
// go through all versions
// use binary search algo

public class BadVersion278_2 {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean isBadVersion(int midpoint) {
        //this API defined in parent class
        return true;
    }
}
