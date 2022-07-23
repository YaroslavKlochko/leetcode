//Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
//A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.

import com.company.algorithms.dataStructures.TreeNode;

public class ConvertSortedArrayToBST108 {

    public TreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0) {
            return null;
        }
        TreeNode head = createBST(num, 0, num.length - 1);
        return head;
    }

    public TreeNode createBST(int[] num, int left, int right) {
        if (left > right) { // Done
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = createBST(num, left, mid - 1);
        node.right = createBST(num, mid + 1, right);
        return node;
    }
}
