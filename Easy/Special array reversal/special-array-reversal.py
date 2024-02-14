#User function Template for python3

class Solution:
    def reverse(self, s):
        # code here
        lookup = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
        
        i = 0
        j = len(s)-1
        
        s_array = list(s)
        
        while i<j:
            
            if s_array[i] not in lookup:
                i += 1
            elif s_array[j] not in lookup:
                j -= 1
            
            else:
                s_array[i], s_array[j] = s_array[j], s_array[i]
                i+=1
                j-=1
                
        return "".join(s_array)
            
        
            

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        s = input().strip()
        
        ob = Solution()
        ans = ob.reverse(s)
        print(ans)
# } Driver Code Ends