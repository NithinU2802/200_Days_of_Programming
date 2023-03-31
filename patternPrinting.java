/******************************************************************************

print the required pattern....

Input:
5

Output:
    0
   0 1
  0 1 2
 0 1 2 3
0 1 2 3 4

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int s=0;
	int n=x.nextInt();
	for(int i=0;i<n;i++){
	    for(int j=0;j<n-i;j++) System.out.print(" ");
	   // for(int j=0;j<=i;j++){
	        for(int k=0;k<=s;k++) System.out.print(k+" ");
	    //}
	    System.out.println();
	    s++;
	}
	}
}
