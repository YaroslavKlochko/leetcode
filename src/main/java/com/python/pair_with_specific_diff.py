from typing import List


class Solution:
    def find_pair_with_specific_difference(self, arr: List[int], k : int) -> List[Tuple[int, int]]:

        if k == 0:
            return []

        values = []
        answer: List[Tuple[int, int]] = []

        for x in arr:
            values[x - k] = x

        for y in arr:
            if y in values:
                answer.append((values[y], y))

        return answer

