import com.company.algorithms.dataStructures.Node;
import com.company.algorithms.dataStructures.TreeNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

//To find path from one node to another
//To find shortest path in unweighted graph
// DO NOT use for huge amount of data 

public class BreadthFirstTraversal {

    static void BreadthFirst(TreeNode node) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            node = queue.remove();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    //-------------------------------------------------------------------------------

    public boolean bfs(Node start, Node end) {
        Set<Node> visited = new HashSet<>();
        Queue<Node> adjacent = new LinkedList<>();
        adjacent.add(start);

        while (!adjacent.isEmpty()) {
            Node current = adjacent.remove();
            if (current.val == end.val) {
                return true;
            }
            for (int i = 0; i < current.children.size(); i++) {
                Node adjacentNode = current.children.get(i);
                if (!visited.contains(adjacentNode)) {
                    adjacent.add(current.children.get(i));
                }
            }
            visited.add(current);
        }
        return false;
    }
}
