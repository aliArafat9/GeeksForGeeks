//{ Driver Code Starts
import java.util.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();

        int T = sc.nextInt();

        while (T != 0) {
            long n = sc.nextLong();
            if (ob.fascinating(n))
                System.out.println("Fascinating");
            else
                System.out.println("Not Fascinating");
            T--;
        }
    }
}
// } Driver Code Ends

class Solution {
   
    boolean fascinating(long n) {
        String concatenated = n + "" + (n * 2) + "" + (n * 3);
        
       
        char[] digits = concatenated.toCharArray();
        Arrays.sort(digits);
        
        
        String sortedString = new String(digits);
        
        
        return "123456789".equals(sortedString);
    }
}