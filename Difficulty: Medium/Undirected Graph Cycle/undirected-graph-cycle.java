//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited =  new boolean[adj.size()];
        
        for(int i=0; i<adj.size(); i++){
            //voh node not visited? = true
            //usmein cycle detected? = true
            //isliye overall true == cycle is there
            if(!visited[i] && iscycledfs(adj, i, visited, -1)){
                return true;
            }
            //!visited[]
            //This is crucial in case the graph is disconnect. A 
            //disconnected graph might have a cycle in one of its components, so 
            //we must explore all components.
        }
        //no cycle ==  false
        return false;
    }
    
    //u = starting point
    //parent = parent of the node;
    boolean iscycledfs(ArrayList<ArrayList<Integer>> adj, int u, boolean [] visited, int parent){
        visited[u]= true;
        
        for(int v: adj.get(u)){
            //if node is parent then skip that node
            if(v == parent)
                continue;
            
            // if collide with the node which is already visited and not a parent
            //then a cycle is detected
            if(visited[v])
                return true;
            
            else if(!visited[v]){
                //u is parent of v
                if(iscycledfs(adj, v, visited, u) == true)
                    return true;
            }
        }
        return false;
    }
}