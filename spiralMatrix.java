/******************************************************************************

Sprial Printing in anti-clockwise direction..


Input:
3
1 2 3
4 5 6
7 8 9

Output:
3 2 1 4 7 8 9 6 5

Input:
4
2 3 1 8
2 4 9 1
3 1 8 1
2 4 6 1

Output:
8 1 3 2 2 3 2 4 6 1 1 1 9 4 1 8

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
	int ri=0,rj=n-1,ci=0,cj=n-1;
	while(ri<=rj && ci<=cj){
	    for(int j=cj;j>=ci;j--)
	    System.out.print(a[ri][j]+" ");
	    ri++;
	    for(int i=ri;i<=rj;i++)
	    System.out.print(a[i][ci]+" ");
	    ci++;
	    for(int j=ci;j<=cj;j++)
	    System.out.print(a[rj][j]+" ");
	    rj--;
	    for(int i=rj;i>=ri;i--)
	    System.out.print(a[i][cj]+" ");
	    cj--;
	}
	}
}
