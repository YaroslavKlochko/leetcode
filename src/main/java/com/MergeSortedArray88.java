// create a final, big box
// create 2 pointers and not permanent box
// iterate and check boundary conditions
// sort elements with checks
// return sorted elements to our first array

public class MergeSortedArray88 {
    public void mergeWithExplanation(int[] nums1, int m, int[] nums2, int n) {
        //make a new array to get the answer
        int[] result = new int[m + n];
        //beginning from both head
        int i = 0;
        int j = 0;
        int temp;
        while (i < m || j < n) {
            if (i == m) {
                //if nums1 is ending just copy the nums2
                temp = nums2[j++];
            } else if (j == n) {
                //if nums2 is ending just copy the nums1
                temp = nums1[i++];
            } else if (nums1[i] < nums2[j]) {
                //copy the smaller number
                temp = nums1[i++];
            } else {
                temp = nums2[j++];
            }
            result[i + j - 1] = temp;
        }
        //copy the answer to the nums1
        for (int length = 0; length < n + m; length++) {
            nums1[length] = result[length];
        }
    }

    void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int i = 0;
        int j = 0;
        int temp;
        while (i < m || j < n) {
            if (i == m) {
                temp = nums2[j++];
            } else if (j == n) {
                temp = nums1[i++];
            } else if (nums1[i] < nums2[j]) {
                temp = nums1[i++];
            } else {
                temp = nums2[j++];
            }
            result[i + j - 1] = temp;
        }
        for (int length = 0; length < n + m; length++) {
            nums1[length] = result[length];
        }
    }
}
