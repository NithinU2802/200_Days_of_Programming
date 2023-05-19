/******************************************************************************


                   Write a Java program to check whether a given number is ugly.
In number system, ugly numbers are positive numbers whose only prime factors are 
2, 3 or 5. First 10 ugly numbers are 1, 2, 3, 4, 5, 6, 8, 9, 10, 12. By convention,
1 is included.


Input: 235
Output :
False

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	if(n%2==0 || n%3==0 || n%5==0)
	System.out.print("False");
	else 
	System.out.print("True");
	}
}
