import com.company.algorithms.dataStructures.TreeNode;

public class BinaryTreeLongestConsecutiveSequence298 {
    public int longestConsecutive(TreeNode root) {
        int[] max = new int[1];
        findLongestConsecutiveSequence(root, 0, 0, max);
        return max[0];
    }

    public void findLongestConsecutiveSequence(TreeNode root, int count, int target, int[] max) {
        if (root == null) {
            return;
        } else if (root.value == target) {
            count++;
        } else {
            count = 1;
        }

        max[0] = Math.max(max[0], count);
        findLongestConsecutiveSequence(root.left, count, root.value + 1, max);
        findLongestConsecutiveSequence(root.right, count, root.value + 1, max);
    }
}
