package algorithms;

import algorithms.dataStructures.TreeNode;
import algorithms


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

//To find path from one node to another
//To find the shortest path in unweighted graph
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

    public boolean bfs(ListNode start, ListNode end) {
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
