class Solution:
    def longestSubsequence(self, nums: List[int]) -> int:
        result=0
        left=0
        window_sum=0
        for right in range(len(nums)):
            window_sum=window_sum^nums[right]
            if(window_sum<1):
                result=max(result,(right-left)+1)
                window_sum=0^nums[right]
        print(result)
        return result

obj=Solution()
obj.longestSubsequence([1,2,3])
