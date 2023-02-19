/******************************************************************************

Find element in sorted Matrix ....

Input: 
3 3
1 2 3 
6 7 8 
10 11 13 
8

Output: 1 2

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int r=x.nextInt(),c=x.nextInt();
	int[][] a=new int[r][c];
	for(int i=0;i<r;i++)
	for(int j=0;j<c;j++) a[i][j]=x.nextInt();
	int k=x.nextInt();
	for(int i=0;i<r;i++){
	    for(int j=0;j<c;j++){
	        if(a[i][j]==k){
	            System.out.print(i+" "+j);
	            return;
	        }else if(a[i][j]>k) break;
	    }
	}
	System.out.print("-1");
	}
}
