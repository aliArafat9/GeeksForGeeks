//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        while (testCases-- > 0) {
            // Read capacity
            int capacity = Integer.parseInt(br.readLine());

            // Read values
            String[] valInput = br.readLine().split(" ");
            int[] val = new int[valInput.length];
            for (int i = 0; i < valInput.length; i++) {
                val[i] = Integer.parseInt(valInput[i]);
            }

            // Read weights
            String[] wtInput = br.readLine().split(" ");
            int[] wt = new int[wtInput.length];
            for (int i = 0; i < wtInput.length; i++) {
                wt[i] = Integer.parseInt(wtInput[i]);
            }

            // Call the knapSack function and print the result
            System.out.println(Solution.knapSack(capacity, val, wt));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    
    static int max(int[] val,int[] wt,int capacity,int i,int[][] arr){
        
        
        if(i==0||capacity==0){
            return 0;
        }
        
        if(arr[i][capacity]!=0){
            return arr[i][capacity];
        }
        
        
        if(wt[i-1]<=capacity){
            int ans1=val[i-1]+max(val,wt,capacity-wt[i-1],i-1,arr);
            int ans2=max(val,wt,capacity,i-1,arr);
            arr[i][capacity]=Math.max(ans1,ans2);
            return arr[i][capacity];
        }
        else{
           arr[i][capacity] =max(val,wt,capacity,i-1,arr);
           return arr[i][capacity];
        }
        
        
        
        
        
        
    }
    
    static int knapSack(int capacity, int val[], int wt[]) {
        int arr[][]=new int[val.length+1][capacity+1];
   
        return max(val,wt,capacity,val.length,arr);
        
    }
}