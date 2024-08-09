//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            long ans = ob.prime_Sum(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution
{
    public long prime_Sum(int n)
    {
        // code here
        boolean prime[]= new boolean [n+1];
      
        for(int p=2;p*p<=n;p++){
            if(prime[p]==false){
                for(int i=p*p;i<=n;i+=p){
                    prime[i]=true;
                }
            }}
            long ans=0;
            for(int i=2;i<=n;i++){
                if(prime[i]==false)ans+=i;
            }
            return ans;
            
        }
    
}