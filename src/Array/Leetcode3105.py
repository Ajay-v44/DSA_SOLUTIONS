class Solution:
    def longestMonotonicSubarray(self, nums: List[int]) -> int:
        l=len(nums)
        if l<=1:
            return 1
        inc=1
        desc=1
        count=0
        for i in range(1,l):
            if nums[i]<nums[i-1]:
                desc+=1
                inc=1
            elif nums[i]>nums[i-1]:
                inc+=1
                desc=1
            else:
                inc=1
                desc=1
            count=max(max(inc,desc),count)
        return count

