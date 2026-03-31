from typing import Optional

class Solution:
    def largest_smaller_bst_key(self, root: Node, num: int) -> Optional[Node]:
        result = None
        current = root

        while current:
            if current.key < num:
                result = current
                current = current.right
            else:
                current = current.left

        return result