class Solution(object):
    def checkValidString(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack1=[]
        stack2=[]
        for i in range(len(s)):
            if s[i]=="(" :
                stack1.append(i)
            elif s[i]=="*":
                stack2.append(i)
            else:
                if not stack1 and not stack2:
                    return False
                if not stack1:
                    stack2.pop()
                else:
                    stack1.pop()
        while stack1 and stack2:
            if stack1[-1]>stack2[-1]:
                return False
            stack1.pop()
            stack2.pop()

        return len(stack1)==0