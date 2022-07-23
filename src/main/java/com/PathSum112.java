import com.company.algorithms.dataStructures.TreeNode;

public class PathSum112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        } else if (root.left == null && root.right == null && targetSum - root.value == 0) {
            return true;
        } else {
            return hasPathSum(root.left, targetSum - root.value) || hasPathSum(root.right, targetSum - root.value);
        }
    }
}
