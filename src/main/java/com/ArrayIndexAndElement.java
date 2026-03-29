public class ArrayIndexAndElement {
    int indexEqualsValueSearch(int[] arr) {
        if (arr.length == 1) {
            return (arr[0] == 0) ? 0 : -1;

        }
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = arr[mid];

            if (value == mid) {
                result = mid;
                right = mid - 1;
            } else if (value < mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
