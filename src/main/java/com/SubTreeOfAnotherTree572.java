import com.company.algorithms.dataStructures.TreeNode;

public class SubTreeOfAnotherTree572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        } else if (isSametree(root, subRoot)) {
            return true;
        } else {
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }

    public boolean isSametree(TreeNode root, TreeNode subRoot) {
        if (root == null || subRoot == null) {
            return root == null && subRoot == null;
        } else if (root.value == subRoot.value) {
            return isSametree(root.left, subRoot.left) && isSametree(root.right, subRoot.right);
        } else {
            return false;
        }
    }
}
