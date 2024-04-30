//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int a1;
            a1 = Integer.parseInt(br.readLine());
            
            
            int a2;
            a2 = Integer.parseInt(br.readLine());
            
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.nthTermOfAP(a1, a2, n);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends

class Solution {
    public static int nthTermOfAP(int a1, int a2, int n) {
        // code here
   int diff = a2 - a1;
   int ans = 0;
   int temp = 0;
   // never forget edge cases
   if(n == 1){
       return a1;
   }
   for(int i = 3 ; i <= n ; i++){
       
       ans = a2 + diff;
       a2 = ans;
      
   }
      return ans;  
    }
}