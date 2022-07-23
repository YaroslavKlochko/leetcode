public class FindMedianSortedArray4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 & nums2.length == 0) {
            return -1;
        }
        int n1 = 0;
        int n2 = 0;
        double result = 0;
        int[] merged = new int[nums1.length + nums2.length];
        while (n1 + n2 < merged.length) {
            for (int i = 0; i < merged.length; i++) {
                if (n1 == nums1.length) {
                    merged[i] = nums2[n2];
                    n2++;
                } else if (n2 == nums2.length) {
                    merged[i] = nums1[n1];
                    n1++;
                } else if (nums1[n1] < nums2[n2]) {
                    merged[i] = nums1[n1];
                    n1++;
                } else {
                    merged[i] = nums2[n2];
                    n2++;
                }

            }
        }
        if (merged.length % 2 == 0) {
            result = (double) (merged[merged.length / 2 - 1] + (merged[merged.length / 2])) / 2;
        } else result = merged[merged.length / 2];
        return result;
    }
}
