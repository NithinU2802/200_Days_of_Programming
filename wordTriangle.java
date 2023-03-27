/******************************************************************************

print the requred patter...

Input:
abcdef

Output:
--a
-f-b
e-d-c


Input:
skillrack

Output:
---s
--k-k
-c---i
a-r-l-l


*******************************************************************************/

import java.util.*;

public class wordTriangle
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	int n=s.length(),m=n/2,l=n-1,f=0,d=-1;
	for(int i=0;i<m-1;i++){
	    for(int j=0;j<m-i-1;j++) System.out.print("-");
	    if(i!=0)
	    System.out.print(s.charAt(l--));
	    for(int j=0;j<i+d;j++) System.out.print("-");
	    System.out.print(s.charAt(f++));
	    System.out.println();
	    d++;
	}
	for(int j=0;j<n-1;j++){
	    if(j%2!=0){ if(j+1!=n-1) System.out.print("-");  }
	    else System.out.print(s.charAt(l--));
	}
	}
}
