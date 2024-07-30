//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution 
{
   
    public static int maxMeetings(int start[], int end[], int n)
    {
      PriorityQueue<Node> pq=new PriorityQueue<Node>((a,b)->a.end-b.end);
      for(int i=0;i<n;i++){
          pq.add(new Node(start[i],end[i]));
      }
      int count=1;
      int prev=pq.poll().end;
      while(pq.size()>0){
          Node curr=pq.poll();
      
          if(curr.start>prev){
              count++;
              prev=curr.end;
          }
          
      }
      return count;
    }
    static class Node{
        int start;
        int end;
        Node(int start,int end){
            this.start=start;
            this.end=end;
        }
    }
}