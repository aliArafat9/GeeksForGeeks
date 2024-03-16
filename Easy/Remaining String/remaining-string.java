//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            char ch = read.readLine().charAt(0);
            int count = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            String result = ob.printString(s,ch,count);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String printString(String S, char ch, int count) {
        // code here
        int k=-1;
        int counter=0;
        if(count==0)return S;
          String c=String.valueOf(ch);
while(S.indexOf(c,k+1)!=-1){
          counter++;
            int j=S.indexOf(c,k+1);
            k=j;
            if(counter==count){
                if(k!=S.length()-1){
                return S.substring(k+1,S.length());
                    
                }
            }
        }
        
    
        return "Empty string";
    }
}