class Solution(object):
    def scoreOfParentheses(self, s):
        stack=[0]
        for c in s:
            if c=="(":
                stack.append(0)
            else:
                inner=stack.pop()
                if inner>0:
                    stack[-1]+=2*inner
                else:
                    stack[-1]+=1
        return stack[-1]