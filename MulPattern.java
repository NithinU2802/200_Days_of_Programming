/******************************************************************************

Build the following pattern for the given input.

Input: 2

Output:
1 2
2


Input: 5

Output:
1 2 3 4 5
2 4 6 8
4 8 12
8 16
16

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int s=1;
	while(n>0){
	    int t=s;
	    for(int i=0;i<n;i++){ System.out.print(t+" "); t+=s; }
	    System.out.println();
	    n--;
	    s+=s;
	}
	}
}
