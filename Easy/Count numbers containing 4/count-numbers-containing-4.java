//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int res = obj.countNumberswith4(n);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int countNumberswith4(int n) {
        
        int count=0;
        
        for(int i=0;i<=n;i++){
            if(digit(i,4)){
                count++;
            }
        }
        return count;
    }
    private static boolean digit(int a, int b){
        
        String strNumber=Integer.toString(a);
        char charDigit=Character.forDigit(b,10);
        return strNumber.indexOf(charDigit)!=-1;
    }
}