/******************************************************************************

Build the program to print the following pattern based on n.


Test Case 1:
Input

Enter the value of n: 2

Output

1 2

2


Test Case 2:
Input

Enter the value of n: 5

Output

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
	int m=1,s=0;
	for(int i=0;i<n;i++){
	    s=m;
	    for(int j=0;j<n-i;j++){
	        System.out.print(s+" ");
	        s+=m;
	    }
	    System.out.println();
	    m*=2;
	}
	}
}
