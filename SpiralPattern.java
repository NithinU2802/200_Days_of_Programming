/******************************************************************************

 Given a number n as the size of the matrix, the task is to print a spiral pattern of size n.
 
Input:
n = 4

Output: 
1   2  3 4 
12 13 14 5 
11 16 15 6 
10  9  8 7

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int c=1,si=0,ei=n-1,sj=0,ej=n-1;
	int[][] a=new int[n][n];
	
	while(c<=n*n){
	    for(int j=sj;j<=ej;j++)
	    a[si][j]=c++;
	    si++;
	    for(int i=si;i<=ei;i++)
	    a[i][ej]=c++;
	    ej--;
	    for(int j=ej;j>=sj;j--)
	    a[ei][j]=c++;
	    ei--;
	    for(int i=ei;i>=si;i--)
	    a[i][sj]=c++;
	    sj++;
	}
	
	for(int i=0;i<n;i++){
	    for(int j=0;j<n;j++)
	    System.out.print(a[i][j]+" ");
	    System.out.println();
	}
	}
}
