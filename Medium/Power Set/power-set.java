//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public void helper(String s, String str, int i, List<String> a){
        if(i >= s.length()){
            if(str != "")
                a.add(str);
            return;
        }
        
        
        helper(s, str, i+1, a);
        str += s.charAt(i);
        helper(s, str, i+1, a);
        
    }
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        List<String> a = new ArrayList<>();
        String str = "";
        helper(s, str, 0, a);
        Collections.sort(a);
        return a;
    }
}