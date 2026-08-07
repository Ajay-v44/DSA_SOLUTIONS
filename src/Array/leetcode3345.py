class Solution:
    def get_product(self,num):
        product=1
        while(num>0):
            rem=num%10
            product=product*rem
            num//=10
        return product

    def smallestNumber(self, n: int, t: int) -> int:

        while(self.get_product(n)%t!=0):
            n+=1

        return n



obj=Solution()
print(obj.smallestNumber(15,3))