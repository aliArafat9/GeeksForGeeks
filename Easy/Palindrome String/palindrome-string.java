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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
    StringBuilder str = new StringBuilder();
     Stack<Character> s1 = new Stack<>();
     for(int i =0;i<S.length();i++){
         s1.push(S.charAt(i));
     }
     while(!s1.isEmpty()){
         str.append(s1.pop());
     }
     if(str.toString().equals(S)){
         return 1;
     }
     else{
         return 0;
     }
      
    }
};