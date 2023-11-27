class Solution:
    def remove_duplicates(self, nums):
        i = 0
        for n in nums:
            if(i < 2 or n < nums[i]):
                nums[i] = n
        return i
