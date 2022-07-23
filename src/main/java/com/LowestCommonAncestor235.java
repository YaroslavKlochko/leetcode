//Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
//
//According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in
//T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

import com.company.algorithms.dataStructures.TreeNode;

// check values
// check subtrees
// return ancestor

public class LowestCommonAncestor235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.value > p.value && root.value > q.value) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.value < p.value && root.value < q.value) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }
}
