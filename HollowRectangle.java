/*******************************************************************************

Hollow Rectangle

input: 4 5

output:

* * * * *
*       *
*       *
* * * * *

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt(),m=x.nextInt();
	char[][] a=new char[n][m];
	for(int i=0;i<n;i++){
	    for(int j=0;j<m;j++){
	        if(i==0 || j==0 || i==n-1 || j==m-1)
	        System.out.print("* ");
	        else System.out.print("  ");
	    }
	    System.out.println();
	}
	}
}
