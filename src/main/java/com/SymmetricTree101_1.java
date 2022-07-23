import com.company.algorithms.dataStructures.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// check base case and use helper
// check base case for subtrees and values
// check mirror

public class SymmetricTree101_1 {

    boolean isSymmetric(TreeNode root) {

        return (root == null || isSymmetricHelper(root.left, root.right));
    }

    boolean isSymmetricHelper(TreeNode leftRoot, TreeNode rightRoot) {
        if (leftRoot == null || rightRoot == null)
            return leftRoot == rightRoot;

        if (leftRoot.value != rightRoot.value)
            return false;
        return isSymmetricHelper(leftRoot.left, rightRoot.right) && isSymmetricHelper(leftRoot.right, rightRoot.left);
    }

    public boolean isSymmetricTest0(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) return true;
        if (root.left == null || root.right == null) return false;
        // children are not null
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);

        while (stack.size() > 0) {
            TreeNode t1 = stack.pop();
            TreeNode t2 = stack.pop();
            // null check
            if (t1 == null && t2 == null) continue;
            if (t1 == null || t2 == null) return false;
            // value check
            if (t1.value != t2.value) return false;
            // push children
            stack.push(t1.right);
            stack.push(t2.left); // could be null
            stack.push(t1.left);
            stack.push(t2.right);
        }

        return true;
    }

//----------------------------------------------------------------------------------------------------------


    //Iteration (BFS).Compare nodes at each layer.
    public boolean isSymmetricTest(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);

        while (queue.size() > 0) {
            TreeNode t1 = queue.poll();
            TreeNode t2 = queue.poll();
            // check
            if (t1 == null && t2 == null) continue;
            if (t1 == null || t2 == null) return false;
            if (t1.value != t2.value) return false;
            // offer children
            queue.offer(t1.left);
            queue.offer(t2.right);

            queue.offer(t1.right);
            queue.offer(t2.left);
        }
        return true;
    }
}
