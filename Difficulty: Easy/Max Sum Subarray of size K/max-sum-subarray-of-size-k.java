//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        long currentSum = 0;
        long maxSum = 0;
        for( int i = 0; i < K; i++){
            currentSum+=Arr.get(i);
        }
        maxSum = currentSum;
        for( int i = 1, j = K; j < N; i++, j++){
            currentSum=currentSum-Arr.get( i - 1 )+Arr.get(j);
            maxSum = Math.max(currentSum,maxSum);
        }
        return maxSum;
    }


}