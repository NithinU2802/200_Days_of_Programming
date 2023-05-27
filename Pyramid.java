/******************************************************************************

. Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.

Input: 4

Output:
       1
      2 2
     3 3 3
    4 4 4 4 
    
*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	for(int i=0;i<n;i++){
	    for(int j=0;j<n-i;j++) System.out.print(" ");
	    System.out.print((i+1)+" ");
	    for(int j=0;j<i*2;j++)
	    if(j%2==0) System.out.print((i+1));
	    else 
	    System.out.print(" ");
	    System.out.println();
	}
	}
}
