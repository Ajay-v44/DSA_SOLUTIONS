class Solution:
    def digitSum(self, s: str, k: int) -> str:
        while len(s)>k:
            i=0
            j=k
            new_str=""
            while i<len(s):
                group = s[i:j]
                digit_sum = sum(int(ch) for ch in group)
                new_str+=str(digit_sum)
                i=j
                j+=k
            s=new_str
        return s


obj=Solution()
print(obj.digitSum(  "11111222223",  3))