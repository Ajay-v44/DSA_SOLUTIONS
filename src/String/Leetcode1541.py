class Solution:
    def minInsertions(self, s: str) -> int:
        needed_b=close_b=0
        for c in s:
            if c=="(":
                if close_b%2==1:
                    needed_b+=1
                    close_b-=1
                close_b+=2
            else:
                close_b-=1
                if close_b<0:
                    needed_b+=1
                    close_b=1
        return needed_b+close_b