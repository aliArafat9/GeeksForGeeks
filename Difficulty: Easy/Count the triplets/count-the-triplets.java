//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG 
{
    public static void main(String args[]) throws IOException 
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            int n = Integer.parseInt(read.readLine());
            String input[] = read.readLine().split(" ");
            
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.countTriplet(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int countTriplet(int arr[], int n) {
        // code here
        
        Arrays.sort(arr);
        int tripletCount = 0;
        for(int i=0; i<n; i++) {
            
            int low = 0; int high = n-2;
            
            while(low<high){
                int sum = arr[low] + arr[high];
                
                if(sum==arr[i]){
                    tripletCount++;
                    low++;
                    high--;
                }
                else if(sum < arr[i]){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        return tripletCount;
    }
}