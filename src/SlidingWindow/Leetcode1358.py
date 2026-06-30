class Solution:
    def numberOfSubstrings(self, s: str) -> int:
        dict={'a':0,'b':0,'c':0}
        i=0
        j=0
        count=0
        leng=len(s)
        while(j<leng):
            dict[s[j]]+=1
            while(dict['a']>0 and dict['b']>0 and dict['c']>0):
                count+=(leng-j)
                dict[s[i]]-=1
                i+=1
            j+=1
        return count