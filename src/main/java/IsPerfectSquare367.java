public classs IsPerfectSquare367 {

    public boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        int left = 0, right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;
            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public boolean isPerfectSquare2(int num) {
        if (num < 0) {
            return false;
        }
        long result = num;
        while (result * result > num) {
            result = (result + num / result) / 2;
        }
    }
}