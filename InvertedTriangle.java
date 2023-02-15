/******************************************************************************

Inverted triangle.....

Input: 5

output:
*********
 *******
  *****
   ***
    *

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int s=-1,e=n+n-1;
	for(int i=0;i<n;i++){
	    for(int j=0;j<n+n-1;j++){
	        if(j<=s || j>=e) System.out.print(" ");
	        else System.out.print("*");
	    }
	    System.out.println();
	    s++;
	    e--;
	}
	}
}
