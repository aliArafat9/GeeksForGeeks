//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxIndexDiff(arr));
        }
    }
}
// } Driver Code Ends


class Solution {
    int maxIndexDiff(int arr[]) {
        int n=arr.length;
        if(n==0) return 0;
        int leftMin[]=new int[n];
        leftMin[0]=arr[0];
        for(int i=1;i<n;i++) leftMin[i]=Math.min(leftMin[i-1],arr[i]);
        int rightMax[]=new int[n];
        rightMax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--) rightMax[i]=Math.max(rightMax[i+1],arr[i]);
        int i=0;
        int j=0;
        int idx=-1;
        while(i<n && j<n){
            if(leftMin[i]<=rightMax[j]){
                idx=Math.max(idx,j-i);
                j++;
            }
            else i++;
        }
        return idx;
    }
}