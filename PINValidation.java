/******************************************************************************

Write a Java program to validate a personal identification number (PIN). Assume
a PIN number is 4, 6 or 8.

Input:
1234 

Output:
True

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	if(s.matches("\\d{4}|\\d{6}|\\d{8}"))
	System.out.println("True");
	else 
	System.out.println("False");
	}
}
