import com.company.algorithms.dataStructures.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class MaxDepthOfBST104_1 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        int count = 0;

        while (!stack.isEmpty()) {
            int size = stack.size();
            while (size-- > 0) {
                TreeNode current = stack.pop();
                if (current.left != null) {
                    stack.addLast(current.left);
                }
                if (current.right != null) {
                    stack.addLast(current.right);
                }
            }
            count++;
        }
        return count;
    }
}
