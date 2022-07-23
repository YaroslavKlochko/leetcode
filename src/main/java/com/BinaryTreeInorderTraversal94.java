import com.company.algorithms.dataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal94 {

    public List<Integer> inorderTraversal0(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> outputArray = new ArrayList<>();

        if (root == null) {
            return outputArray;
        }

        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            outputArray.add(current.value);
            current = current.right;
        }
        return outputArray;
    }

    //-------------------------------------------------------

    List<Integer> ans = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return ans;
        }
        inorderTraversal(root.left);
        ans.add(root.value);
        return inorderTraversal(root.right);
    }

    //-------------------------------------------------------

    public List<Integer> inorderTraversal2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            ans.add(cur.value);
            cur = cur.right;
        }
        return ans;
    }
}
