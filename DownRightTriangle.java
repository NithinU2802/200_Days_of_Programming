/******************************************************************************

    Downward Right Triangle using Asterisk(*).
    
    
Input:
5
Output:
*****
****
***
**
*


Input:
7
Output:
*******
******
*****
****
***
**
*

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	for(int i=0;i<n;i++){
	    for(int j=0;j<n-i;j++)
	    System.out.print("*");
	    System.out.println();
	}
	}
}
