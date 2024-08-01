//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		String s12 = sc.nextLine();
		for(int i=0; i<t; i++){
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    
		    Solution obj = new Solution();
		    
		    boolean flag = obj.isRotated(s1, s2);
		    
		    if(flag == true) System.out.println("1");
		    else System.out.println("0");
		    
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        // for anticlocKvise rotation by 2 places;
        char [] a = str1.toCharArray();
        antiClockVise(a);
        antiClockVise(a);
        if(str2.equals(new String(a))) return true;
        
       // for clocKvise rotation by 2 places;
        a = str1.toCharArray();
        clockVise(a);
        clockVise(a);
         if(str2.equals(new String(a))) return true;
         
         return false;
    }
    public static void antiClockVise(char a[]){
        char t = a[a.length-1];
        for(int i=a.length-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0] = t;
    }
    public static void clockVise(char a[]){
       char t = a[0];
       for(int i=1;i<a.length;i++){
           a[i-1] = a[i];
       }
       a[a.length-1] = t;
    }
    
}