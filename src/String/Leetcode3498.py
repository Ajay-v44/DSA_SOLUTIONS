class Solution:
    def reverseDegree(self, s: str) -> int:
        i=1
        sum=0
        for c in s:
            sum+=((27-(ord(c)-96))*i)
            i+=1
        return sum 