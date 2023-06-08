/******************************************************************************

Java Program to Print Square Star Pattern

Input: 12

Output:
************
**        **
* *      * *
*  *    *  *
*   *  *   *
*    **    *
*    **    *
*   *  *   *
*  *    *  *
* *      * *
**        **
************

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	for(int i=0;i<n;i++){
	    for(int j=0;j<n;j++){
	        if(i==0 || j==0 || i==n-1 || j==n-1 || i==j || i==n-1-j)
	        System.out.print("*");
	        else System.out.print(" ");
	    }
	    System.out.println();
	}
	}
}
