class Solution:
    def smallestIndex(self, nums: List[int]) -> int:
        min_idx=float("inf")
        for i,num in enumerate(nums):
            sum=0
            while num>0:
                rem=num%10
                sum=sum+rem
                num//=10
            if sum==i:
                min_idx=min(min_idx,i)
        return -1 if min_idx==float("inf") else min_idx