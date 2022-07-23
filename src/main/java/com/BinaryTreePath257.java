import com.company.algorithms.dataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) {
            return paths;
        }
        depthSearch(root, "", paths);
        return paths;
    }

    private void depthSearch(TreeNode root, String path, List<String> paths) {

        path += root.value;
        if (root.left == null && root.right == null) {
            paths.add(path);
        }
        if (root.left != null) {
            depthSearch(root.left, path + "->", paths);
        }
        if (root.right != null) {
            depthSearch(root.right, path + "->", paths);
        }
    }
}
