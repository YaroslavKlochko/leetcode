class ShortestSalesPath {

    static class Node {
        int cost;
        Node[] children;
        Node parent;

        Node(int cost) {
            this.cost = cost;
            children = null;
            parent = null;
        }
    }

    static class SalesPath {

        int minPrice = Integer.MAX_VALUE;

        int getCheapestCost(Node rootNode) {
            if (rootNode == null) {
                return 0;
            }

            dfs(rootNode, 0);
            return minPrice;
        }

        void dfs(Node node, int costSoFar) {
            if (node == null) {
                return;
            }

            int newCost = costSoFar + node.cost;

            if (node.children == null || node.children.length == 0) {
                minPrice = Math.min(minPrice, newCost);
                return;
            }

            for (Node child : node.children) {
                dfs(child, newCost);
            }
        }
    }
}