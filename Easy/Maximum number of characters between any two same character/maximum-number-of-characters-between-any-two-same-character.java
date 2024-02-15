//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.maxChars(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int maxChars(String s)
    {
        //code here
        int len = -1;
        Map<Character, Integer> hm = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(hm.containsKey(c)){
                len = Math.max(len, i-hm.get(c)-1);
            }else{
                hm.put(c, i);
            }
        }
        
        return len;
    }
}