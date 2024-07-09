//{ Driver Code Starts
import java.util.*;
import java.util.stream.*; 
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Your code here
        if(a.length()!= b.length())
        {
            return false;
        }
        else{
            char[] a1= a.toCharArray();
            char[] a2= b.toCharArray();
            Character c,c1;
            
            for(Integer i=0;i<a.length();i++)
            {   c=Character.valueOf(a1[i]);
                c1=Character.valueOf(a2[i]);
                
                
                 map.put(c,map.getOrDefault(c,0)+1);
                 map.put(c1,map.getOrDefault(c1,0)-1);
            }
            
            for(Character key: map.keySet()){
                if(map.get(key)!=0)
                {
                    return false;
                }
            }
            return true;
            
        }
        
    }
}