/******************************************************************************

    program to make matrix multiplication
    
Input:
2
Matrix 1:
2 3 
9 3
Matrix 2:
4 3 
6 3

Output:
26 15
54 36


*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int[][] a=new int[n][n],b=new int[n][n],res=new int[n][n];
	for(int i=0;i<n;i++)
	for(int j=0;j<n;j++)
	a[i][j]=x.nextInt();
	for(int i=0;i<n;i++)
	for(int j=0;j<n;j++)
	b[i][j]=x.nextInt();
	for(int i=0;i<n;i++){
	    for(int j=0;j<n;j++){
	        for(int k=0;k<n;k++)
	        res[i][j]+=a[i][k]*b[k][j];
	    }
	}
	
	for(int i=0;i<n;i++){
	    for(int j=0;j<n;j++)
	    System.out.print(res[i][j]+" ");
	    System.out.println();
	}
	
	}
}
