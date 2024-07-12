//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution
{
public int romanToDecimal(String s) 
{
  int res = 0;
  for (int i = s.length() - 1; i >= 0; i--)
   {
    switch (s.charAt(i)) 
     {
      case 'M':
        res += 1000;
        break;
      case 'D':
        res += 500;
        break;
      case 'C':
        res += 100 * (res >= 500 ? -1 : 1); // For CD or CM.
        break;
      case 'L':
        res += 50;
        break;
      case 'X':
        res += 10 * (res >= 50 ? -1 : 1); // For XL or XC.
        break;
      case 'V':
        res += 5;
        break;
      case 'I':
        res += (res >= 5 ? -1 : 1); // For IV or IX.
        break;
      default:
        break;
    }
  }
  return res;
}
}