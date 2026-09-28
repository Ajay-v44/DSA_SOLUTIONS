class Solution:
    def maxDepth(self, s: str) -> int:
        maxcount=count=0

        for p in s:
            if p=="(":
                count+=1
            elif p==")":
                maxcount=max(maxcount,count)
                count-=1
        return maxcount