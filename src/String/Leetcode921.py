class Solution(object):
    def minAddToMakeValid(self, s):
        """
        :type s: str
        :rtype: int
        """
        open_b=needed_b=0
        for c in s:
            if c=="(":
                open_b+=1
            elif open_b==0:
                needed_b+=1
            else:
                open_b-=1
        return needed_b+open_b