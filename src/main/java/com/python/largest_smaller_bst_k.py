from typing import Optional

class Solution:
    def largest_smaller_bst_key(self, root: Node, num: int) -> Optional[Node]:
        candidate = None
        curr = root

        while curr:
            if curr.key < num:
                candidate = curr
                curr = curr.right
            else:
                curr = curr.left

        return candidate