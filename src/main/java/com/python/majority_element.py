class Solution:
    def majority_element(self, nums: List[int]) -> int:
        n = len(nums)
        m = defaultDict(int)

        for num in nums:
            m[num] += 1

        n = n // 2
        for key, value in m.items():
            if value > n:
                return key

        return 0
