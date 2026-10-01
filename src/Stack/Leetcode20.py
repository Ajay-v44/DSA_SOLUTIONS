class Solution:
    def isValid(self, s: str) -> bool:
        parantheis={')':'(','}':'{',']':'['}
        stack=[]
        for p in s:
            if p in parantheis :
                last_char=stack.pop() if stack else "#"
                if parantheis[p]!=last_char:
                    return False
            else:
                stack.append(p)
        return len(stack)==0