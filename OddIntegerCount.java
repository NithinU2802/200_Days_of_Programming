/******************************************************************************

Count Odd Numbers in the given interval.....

Input: low = 3, high = 7
Output: 3

Input: low = 8, high = 10
Output: 1

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int a=x.nextInt(),b=x.nextInt();
	int c=1;
	a=(a%2!=0)?a:a+1;
	b=(b%2!=0)?b:b-1;
	c+=(b-a)/2;
	System.out.print(c);
	}
}
