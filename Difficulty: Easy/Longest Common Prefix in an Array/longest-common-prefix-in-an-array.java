//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        String currString = arr[0];
        String res = "";
        
        for(int i=0; i<n; i++){
            String nextString = arr[i];
            res = compare(currString , nextString);
            if(res.equals("")){
                return "-1";
            }
            currString = res;
        }
        return res;
    }
    
    String compare(String currString, String nextString){
        int i=0, j=0;
        String res = "";
        while(i < currString.length() && j < nextString.length()){
            if(currString.charAt(i) != nextString.charAt(j)){
                break;
            }
            res += currString.charAt(i);
            i++;
            j++;
        }
        return res;
    }
}