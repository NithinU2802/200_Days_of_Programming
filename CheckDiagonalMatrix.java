/******************************************************************************

Check Diagonal Matrix or Not 

Input: 3

1 0 0
0 1 0
0 0 1

output: True 

Input: 4 

2 0 0
0 2 0
0 0 2

output: True


Input: 3

1 2 0
0 2 8
0 0 5

output: False


*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int[][] a=new int[n][n];
	for(int i=0;i<n;i++)
	for(int j=0;j<n;j++) a[i][j]=x.nextInt();
	for(int i=0;i<n;i++)
	for(int j=0;j<n;j++)
	if(i!=j && a[i][j]!=0){ 
	 System.out.println("False");
	 return;
	}
	
	System.out.println("True");
	}
}
