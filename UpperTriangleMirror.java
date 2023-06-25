/******************************************************************************

 Program to Print Mirror Upper Star Triangle Pattern
 
Input:
size = 7

Output:

      * 
     * * 
    * * * 
   * * * * 
  * * * * * 
 * * * * * * 
* * * * * * * 
* * * * * * * 
 * * * * * * 
  * * * * * 
   * * * * 
    * * * 
     * * 
      * 

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	for(int i=n-1;i>=0;i--){
	    for(int j=0;j<=i;j++)
	    System.out.print(" ");
	    for(int j=i;j<n;j++)
	    System.out.print("* ");
	    System.out.println();
	}
	for(int i=0;i<n;i++){
	    for(int j=0;j<=i;j++)
	    System.out.print(" ");
	    for(int j=i;j<n;j++)
	    System.out.print("* ");
	    System.out.println();
	}
	}
}
