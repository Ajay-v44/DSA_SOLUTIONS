class Solution:
    def numOfSubarrays(self, arr: list[int]) -> int:
        count=0
        for i in range(len(arr)):
            sum=0
            for j in range(i,len(arr)):
                sum+=arr[j]
                if sum % 2 !=0:
                    count+=1
        return  count


obj=Solution()
print(obj.numOfSubarrays([1,2,3,4,5,6,7]))