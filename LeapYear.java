/******************************************************************************

    Find the whether the given year is Leap-year or Not.

Input:
2000 

Output:
Leap-year


Input:
2002 

Output: 
Non Leap-year 

1. Number(n) divisible by 4 and not divisible by 100.
2. Number(n) divisible by 100 must divisible by 400.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	if(n%4==0 && n%100!=0 || n%400==0)
	System.out.println("Leap-year");
	else 
	System.out.println("Non Leap-year");
	}
}
