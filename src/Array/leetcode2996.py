class Solution:
    def missingInteger(self, nums: List[int]) -> int:
        prefix_sum=nums[0]
        i=1
        while( i < len(nums) and nums[i-1]+1==nums[i]):
            prefix_sum+=nums[i]
            i+=1

        ans=prefix_sum
        num_set=set(nums)

        while(ans in num_set):
            ans+=1
        return ans