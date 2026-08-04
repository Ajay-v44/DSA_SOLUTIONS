class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        result=[]
        elemnts=set()
        max_ele=nums[0]
        min_ele=nums[0]

        for num in nums:
            if num  in elemnts:
                continue
            if max_ele<num:
                max_ele=num
            if min_ele>num:
                min_ele=num
            elemnts.add(num)

        for i in range(min_ele,max_ele):
            if i not in elemnts:
                result.append(i)
        return result
