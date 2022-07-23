import com.example.dataStructures.ListNode;
import com.example.dataStructures.TreeNode;

import java.util.Stack;

public class DepthFirstTraversal {

    private static ListNode adjVertices;

    static void depthFirstTraversalRecursiveWay(TreeNode root) {
        if (root == null) {
            return;
        }
        depthFirstTraversalRecursiveWay(root.left);
        depthFirstTraversalRecursiveWay(root.right);
    }

    //-----------------------------------------------------------------------------

    public void traverseInOrderWithoutRecursion(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        stack.push(root);
        while (!stack.isEmpty()) {
            while (current.left != null) {
                current = current.left;
                stack.push(current);
            }
            current = stack.pop();
            visit(current.value);
            if (current.right != null) {
                current = current.right;
                stack.push(current);
            }
        }
    }

    private static void visit(int value) {
    }

    //-----------------------------------------------------------------------------

    public void GraphDfsWithoutRecursion(int start) {
        Stack<Integer> stack = new Stack<>();
        boolean[] isVisited = new boolean[adjVertices.size()];
        stack.push(start);
        while (!stack.isEmpty()) {
            int current = stack.pop();
            isVisited[current] = true;
            visit(current);
            for (int dest : adjVertices.get(current)) {
                if (!isVisited[dest])
                    stack.push(dest);
            }
        }
    }
}

