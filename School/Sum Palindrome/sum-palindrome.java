//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isSumPalindrome(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static long isSumPalindrome(long n){
        // code here
        
        long reverse=0, orginal=n;
        for(int i=0;i<=5;i++){
            reverse=0;
             if(orginal== reverse || isPalindrome(reverse+orginal)){
                return reverse +orginal;
            }
            while(n>0){
                long temp=n%10;
                reverse= reverse*10 + temp;
                n/=10;
            }
           
              n=orginal +reverse;
              orginal=n;
        }
             return -1; // Return -1 if no palindrome found within 5 iterations
    }
    
    static boolean isPalindrome(long num) {
        long reversed = 0;
        long temp = num;
        while (temp != 0) {
            long digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return num == reversed;
    }
}