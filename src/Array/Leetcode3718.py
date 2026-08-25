class Solution:
    def missingMultiple(self, nums: List[int], k: int) -> int:
        i=1
        nums=set(nums)

        while k*i in nums:
            i+=1

        return k*i