class Solution:
    def array_index_and_element(self, arr):
        if len(arr) == 1:
            return 0 if arr[0] == 0 else -1

        left = 0
        right = len(arr) - 1
        result = -1

        while left <= right:
            mid = left + (right - left) // 2
            val = arr[mid]

            if val == mid:
                result = mid
                right = mid - 1
            elif val < mid:
                left = mid + 1
            else:
                right = mid - 1

        return result
