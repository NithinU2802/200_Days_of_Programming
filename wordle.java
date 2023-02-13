/******************************************************************************

wordle achieve the solution by strings a and t.....


Input:
3
ABCDE
EDCBA
ROUND
RINGS
START
STUNT

Output:
BBGBB
GBBBB
GGBBG

Explanation
Test Case 1: Given string S=ABCDE and T=EDCBA. The string M is:
Comparing the first indices, A≠E, thus, M[1]=B.
Comparing the second indices, B≠D, thus, M[2]=B.
Comparing the third indices, C=C, thus, M[3]=G.
Comparing the fourth indices, D≠B, thus, M[4]=B.
Comparing the fifth indices, E≠A, thus, M[5]=B.
Thus, M=BBGBB.

Test Case 2: Given string S=ROUND and T=RINGS. The string M is:
Comparing the first indices, R=R, thus, M[1]=G.
Comparing the second indices, O≠I, thus, M[2]=B.
Comparing the third indices, U≠N, thus, M[3]=B.
Comparing the fourth indices, N≠G, thus, M[4]=B.
Comparing the fifth indices, D≠S, thus, M[5]=B.
Thus, M=GBBBB.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	x.nextLine();
	String[] a=new String[n];
	String[] b=new String[n];
	for(int i=0;i<n;i++){
	    a[i]=x.nextLine();
	    b[i]=x.nextLine();
	}
	String r="";
	for(int i=0;i<n;i++){
	    r="";
	    String c=a[i],d=b[i];
	    for(int j=0;j<c.length();j++)
	    if(c.charAt(j)==d.charAt(j)) r+='G';
	    else r+='B';
	    System.out.println(r);
	}
	
	}
}
