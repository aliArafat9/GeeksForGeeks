//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
    public static boolean palindrome(int n){
        int temp=n;
        int remainder;
        int reverse=0;
        while(n!=0){
            remainder=n%10;
            reverse=reverse*10+remainder;
            n=n/10;
        }
        return temp==reverse;
    }
	public static int palinArray(int[] a, int n){
        for(int i=0; i<n; i++){
            if(!palindrome(a[i])){
                return 0;
            }
        }
        return 1;
    }
}