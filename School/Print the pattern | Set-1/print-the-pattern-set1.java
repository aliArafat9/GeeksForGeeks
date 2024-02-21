//{ Driver Code Starts
import java.util.Scanner;



class PrintPattern
{
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			GfG g = new GfG();
			g.printPat(n);
			System.out.println();
		
		t--;
		}
	}
}
// } Driver Code Ends


class GfG
{
    void printPat(int n)
    {   int a=(n*n);
        int m=n;
        for(int i=1;i<=n;i++)
        {      int temp=n;
               for(int l=1;l<=a;l++)
               {   System.out.print(temp+" ");
                   if(l%m==0)
                    temp--;
               }
               a=a-n;
               m--;
               System.out.print("$");
        }
    }
}