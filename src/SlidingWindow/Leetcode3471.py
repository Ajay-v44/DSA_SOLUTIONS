class Solution:
    def largestInteger(self, nums: List[int], k: int) -> int:
        subarray_counts={}
        for i in range(len(nums)-k+1):
            crrent_window=set(nums[i:i+k])
            for num in crrent_window:
                subarray_counts[num]=subarray_counts.get(num,0)+1
        res=-1
        for num,count in subarray_counts.items():
            if count==1:
                res=max(res,num)
        return res