//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.countSub(a, n) ? 1:0);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public boolean countSub(long arr[], long n)
    {
        // Your code goes here
        int j = 0;
        for(int i = 0;i <n  ;i++)
        {
             if(j +i + 2 < n)
              {
         if( arr[i] <arr[i + j +2])
                return false;
              }
              if(j +i + 1 < n)
              {
         if( arr[i] < arr[i + j + 1] )
                
               return false;
              } 
                
                j++;
        }
        
        return true;
    }
}