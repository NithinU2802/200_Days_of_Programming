/******************************************************************************

    Parallelogram pattern representation.
    
Input:
4

Output:
* * * *
- * 1 2 *
- - * 3 4 *
* * * * * * *

Input:
6

Output:
* * * * * *
- * 1 2 3 4 *
- - * 5 6 7 8 *
- - - * 9 10 11 12 *
- - - - * 13 14 15 16 *
* * * * * * * * * * *

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int k=0,h=n-2;
	for(int i=0;i<n;i++){
	    for(int j=0;j<i;j++){
	        if(i==n-1 || i==0)
	            System.out.print("* ");
	        else 
	            System.out.print("- ");
	    }
	    System.out.print("* ");
	    for(int j=0;j<h;j++){
	        if(i==n-1 || i==0)
	            System.out.print("* ");
	        else 
	            System.out.print((++k)+(" "));
	    }
	    System.out.println("*");
	}
	}
}
