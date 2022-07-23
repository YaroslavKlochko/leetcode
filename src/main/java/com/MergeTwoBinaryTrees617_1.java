// check 2 base cases
// merge values
// go into subtrees

import com.company.algorithms.dataStructures.TreeNode;

public class MergeTwoBinaryTrees617_1 {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }

        TreeNode node = new TreeNode(t1.value + t2.value);

        node.left = mergeTrees(t1.left, t2.left);
        node.right = mergeTrees(t1.right, t2.right);

        return node;
    }
}
