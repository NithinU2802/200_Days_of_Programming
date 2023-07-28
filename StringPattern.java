/******************************************************************************

    Illustrate the string into given pattern (all string length in odd).
    
Input:
chicken

Output:
kencchi
enickch
nhickec
chicken


Input:
ABCDEFGHI

Output:
FGHIEABCD
GHIDEFABC
HICDEFGAB
HBCDEFGHA
ABCDEFGHI


*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	int n=s.length();
	int h=s.length()/2,k=h,l=h;
	for(int i=0;i<=h;i++){
	    for(int j=l+1;j<n;j++)
	        System.out.print(s.charAt(j));
	    for(int j=k;j<=l;j++)
	        System.out.print(s.charAt(j));
	    for(int j=0;j<=k-1;j++)
	        System.out.print(s.charAt(j));
	    l++;
	    k--;
	    System.out.println();
	}
	}
}
