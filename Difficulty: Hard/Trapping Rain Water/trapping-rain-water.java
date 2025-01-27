//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().maxWater(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int maxWater(int arr[]) {
        // code here
        if(arr.length<=2) return 0;
        Stack<Integer> s = new Stack<>();
        int ans = 0;
        
        for(int i=0;i<arr.length;i++){
            int max = -1;
            while(!s.isEmpty()){
                if(max==-1 && arr[s.peek()]>arr[i]){
                    break;
                }
                if(max==-1){
                    max = s.pop();
                    continue;
                }
                
                int x = Math.min(arr[s.peek()],arr[i]);
                int y = x - arr[max];
                ans += (y * (i-s.peek()-1));
                if(arr[s.peek()]>arr[i]){
                    break;
                }else{
                    max=s.pop();
                }
                
            }
            s.push(i);  
        }
        
        return ans;
    }
}