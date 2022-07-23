import com.company.algorithms.dataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSumTwo113 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> paths = new ArrayList<>();
        findPaths(root, targetSum, new ArrayList<Integer>(), paths);

        return paths;
    }

    private void findPaths(TreeNode root, int targetSum, ArrayList<Integer> current, List<List<Integer>> paths) {
        if (root == null) {
            return;
        }

        current.add(root.value);
        if (root.value == targetSum && root.left == null && root.right == null) {
            paths.add(current);
            return;
        }

        findPaths(root.left, targetSum - root.value, new ArrayList<Integer>(current), paths);
        findPaths(root.right, targetSum - root.value, new ArrayList<Integer>(current), paths);
    }
}
