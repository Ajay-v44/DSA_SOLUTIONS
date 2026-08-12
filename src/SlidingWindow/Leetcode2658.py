class Solution:
    def maxSubarrayLength(self, nums: List[int], k: int) -> int:
        seen=dict()
        left=0
        for right in range(len(nums)):
            seen[nums[right]]=seen.get(nums[right],0)+1
            while(seen[nums[right]]>k):
                seen[nums[left]]-=1
                left+=1
            max_len=max(max_len,(right-left)+1)
        return max_len

obj=Solution()
print(obj.maxSubarrayLength([1,2,3,1,2,3,1,2],2))