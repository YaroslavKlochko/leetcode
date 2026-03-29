class Solution:
    def get_cheapest_cost(self, rootNode: Node) -> int:
        if not rootNode:
            return 0

        def dfs(node: Node, costSoFar: int) -> int:
            current_total = costSoFar + node.cost

            if not node.children:
                return current_total

            min_child = float('inf')
            for child in node.children:
                min_child = min(min_child, dfs(child, current_total))
            return min_child

        return dfs(rootNode, 0)