/******************************************************************************

Print required pattern by the given input.

Input: 5

Output:
5   1
 4 2 
  3  
 4 2
5   5

Input: 7

Output:
7     1
 6   2 
  5 3
   4
  5 3
 6   2 
7     1



*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt(),f=0,l=n-1,fg=0;
	for(int i=0;i<n;i++){
	    for(int j=0;j<n;j++){
	        if(f==j || l==j) System.out.print((j+1)+" ");
	        else System.out.print("  ");
	    }
	    System.out.println();
	    if(f>l && f==0) fg=1;
	    if(fg==0){ f++; l--; }
	    else { f--; l++; }
	}
	}
}
