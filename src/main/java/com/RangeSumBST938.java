import com.company.algorithms.dataStructures.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class RangeSumBST938 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        if (root == null) {
            return sum;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.remove();
            if (current.value >= low && current.value <= high) {
                sum += current.value;
            }
            if (current.left != null && current.value > low) {
                queue.add(current.left);
            }
            if (current.right != null && current.value < high) {
                queue.add(current.right);
            }
        }
        return sum;
    }
}
