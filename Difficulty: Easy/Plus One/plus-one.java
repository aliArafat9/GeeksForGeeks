//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            ArrayList<Integer> arr = new ArrayList<>();
            
            for(int i=0 ; i<N ; i++)
                arr.add(Integer.parseInt(S[i]));

            Solution ob = new Solution();
            ArrayList<Integer> res = ob.increment(arr,N);
            
            for(int i=0; i<res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) 
    {
        // code here
       for (int i = N - 1; i >= 0; i--) {
            // If the current element is less than 9, increment it and return the list
            if (arr.get(i) < 9) {
                arr.set(i, arr.get(i) + 1);
                return arr;
            } else {
                // Set the current element to 0 if it's 9
                arr.set(i, 0);
            }
        }
        // If all elements were 9, we need a new list with size N + 1
        ArrayList<Integer> Arr = new ArrayList<>(N + 1);
        // Initialize the new list
        Arr.add(1); // First element should be 1
        for (int i = 1; i <= N; i++) {
            Arr.add(0); // All other elements should be 0
        }
        return Arr;
    }
};