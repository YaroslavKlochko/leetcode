class Solution:
    def minAddToMakeValid(self, s: str) -> int:
        leftNeeded = 0
        rightNeeded = 0

        for c in s:
            if c == '(':
                rightNeeded -= 1
            elif c == ')' and rightNeeded > 0:
                rightNeeded -= 1
            else:
                leftNeeded += 1
        return leftNeeded + rightNeeded


