//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int n) {
        int sum = 0;
        
        //sum of digits of given int n and store in sum variable
        while(n>0){
            int temp = n%10;
            sum += temp;
            n /= 10;
        }
        
        int original = sum;
        int reversed = 0;
        
        //reverse the obtained sum 
        while(sum>0){
            int digit = sum %10;
            reversed = reversed*10 + digit;
            sum /= 10;
        }
        //return 1 if sum of digits is equal to reverse of digits of sum
        return (original == reversed) ? 1 : 0;
    }
}