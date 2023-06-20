/******************************************************************************

Pattern Printing Downward Triangle.

Input:
4

Output:
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
	int m=x.nextInt();
	int n=(m*2+1);
	for(int i=0;i<=m;i++){
	    for(int j=0;j<i;j++)
	    System.out.print(" ");
	    for(int j=i;j<n-i;j++)
	    System.out.print("*");
	    for(int j=0;j<i;j++)
	    System.out.print(" ");
	    System.out.println();
	}
	}
}
