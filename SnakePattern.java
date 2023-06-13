/******************************************************************************

Snake Pattern printing...!

Input: 
n=3
mat[][] = { {1, 2, 3},
          {4, 5, 6},
          {7, 8, 9}};
Output: 1 2 3 6 5 4 7 8 9

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int[][] a=new int[n][n];
	for(int i=0;i<n;i++)
	for(int j=0;j<n;j++)
	a[i][j]=x.nextInt();
	for(int i=0;i<n;i++){
	    if(i%2!=0){
	        for(int j=n-1;j>=0;j--)
	        System.out.print(a[i][j]+" ");
	    }else{
	        for(int j=0;j<n;j++)
	        System.out.print(a[i][j]+" ");
	    }
	}
	
	}
}
