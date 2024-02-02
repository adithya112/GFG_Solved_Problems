#User function template for Python

class Solution:
    # your task is to complete this function
    # function should return an integer
    def atoi(self,s):
        # Code here
        lookup = "0123456789"
        sum=0
        val = 1
        
        for i in range(len(s)-1, -1, -1):
            if(s[i] in lookup):
                sum = sum+int(s[i])*val
            elif(s[i] == "-" and i == 0):
                sum = -sum
            else:
                return -1;
                
            
            val = val*10
        
        return sum
        
#{ 
 # Driver Code Starts
#Initial template for Python

if __name__=='__main__':
    t=int(input())
    for i in range(t):
        string = input().strip();
        ob=Solution()
        print(ob.atoi(string))
# } Driver Code Ends