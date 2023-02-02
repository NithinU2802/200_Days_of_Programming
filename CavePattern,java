/******************************************************************************

Decreasing square game....

input: 4

output:

4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int t=n,k=0;
	for(int i=0;i<n;i++){
	    t=n;
	    for(int j=0;j<i;j++) System.out.print((t--)+" ");
	    for(int j=i;j<n+n-i-1;j++) System.out.print((n-k)+" ");
	    t++;
	    for(int j=0;j<i;j++) System.out.print((t++)+" ");
	    k++;
	    System.out.println();
	}
	}
}

