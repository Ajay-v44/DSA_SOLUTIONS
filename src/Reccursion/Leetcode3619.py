class Solution:
    def countIslands(self, grid: List[List[int]], k: int) -> int:
        m=len(grid)
        n=len(grid[0])
        def dfs(i,j):
            if not(0<=i<m and 0<=j<n) or grid[i][j]==0:
                return 0
            num=grid[i][j]
            grid[i][j]=0
            return num+dfs(i+1,j)+dfs(i-1,j)+dfs(i,j+1)+dfs(i,j-1)
        count=0
        for i in range(m):
            for j in range(n):
                if grid[i][j]>0:
                    if dfs(i,j)%k ==0:
                        count+=1
        return count
        