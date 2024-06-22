//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.ExtractNumber(S));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long ExtractNumber(String sentence) {
        // code here
      
        String[] s=sentence.split(" ");
        long max=-1;
        String k="";
        for(int i=0;i<s.length;i++)
        {
            char f=s[i].charAt(0);
            if(f>=48 && f<58)
            {
                if(!s[i].contains("9"))
                {
                    Long ans=Long.parseLong(s[i]);
                    if(ans>max)
                    {
                        max=ans;
                    }
                }
            }
        }
        return max;
    }
}

