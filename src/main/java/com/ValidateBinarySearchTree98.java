import com.company.algorithms.dataStructures.TreeNode;

public class ValidateBinarySearchTree98 {
    public boolean isValidBST(TreeNode root) {
        return validateTree(root, null, null);
    }

    private boolean validateTree(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        } else if (min != null && root.value <= min || max != null && root.value >= max) {
            return false;
        } else {
            return validateTree(root.left, min, root.value) && validateTree(root.right, root.value, max);
        }
    }
}
