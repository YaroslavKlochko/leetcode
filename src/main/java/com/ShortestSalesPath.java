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
            // your code goes here
        }

        void dfs(Node rootNode, int costSoFar) {
            if(rootNode == null) {
                return;
            }
            int newCost = costSoFar + rootNode.cost;

            if(rootNode.children == null || rootNode.children.size() == 0) {
                minPrice = Math.min(minPrice, newCost);
                return;
            }
            for (Node child : rootNode.children) {
                dfs(child,newCost);
            }
        }
    }
}

