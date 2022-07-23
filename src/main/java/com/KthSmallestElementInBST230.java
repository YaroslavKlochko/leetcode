import com.company.algorithms.dataStructures.TreeNode;

public class KthSmallestElementInBST230 {
    public int kthSmallest(TreeNode root, int k) {
        int[] nums = new int[2];
        findSmallestElement(root, nums, k);
        return nums[1];
    }

    private void findSmallestElement(TreeNode root, int[] nums, int k) {
        if (root == null) {
            return;
        }
        findSmallestElement(root.left, nums, k);
        if (++nums[0] == k) {
            nums[1] = root.value;
            return;
        }
        findSmallestElement(root.right, nums, k);
    }
}
