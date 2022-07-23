import com.company.algorithms.dataStructures.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteNodesReturnForest1110 {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> remainingElements = new ArrayList<>();
        Set<Integer> elementsToDelete = new HashSet<>();
        for (int i : to_delete) {
            elementsToDelete.add(i);
        }
        removeNodes(root, elementsToDelete, remainingElements);
        if (!elementsToDelete.contains(root.value)) {
            remainingElements.add(root);
        }
        return remainingElements;
    }

    public TreeNode removeNodes(TreeNode root, Set<Integer> elementsToDelete, List<TreeNode> remainingElements) {
        if (root == null) {
            return null;
        }
        root.left = removeNodes(root.left, elementsToDelete, remainingElements);
        root.right = removeNodes(root.right, elementsToDelete, remainingElements);
        if (elementsToDelete.contains(root.value)) {
            if (root.left != null) {
                remainingElements.add(root.left);
            }
            if (root.right != null) {
                remainingElements.add(root.right);
            }
            return null;
        }
        return root;
    }
}
