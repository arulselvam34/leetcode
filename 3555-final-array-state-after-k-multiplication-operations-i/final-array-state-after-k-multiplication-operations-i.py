class Solution(object):
    def getFinalState(self, nums, k, multiplier):
        n = len(nums)
        for _ in range(k):
            idx = 0
            ans = nums[0]
            for i in range(1, n):
                if nums[i] < ans:
                    ans = nums[i]
                    idx = i
            nums[idx] *= multiplier
        return nums
        