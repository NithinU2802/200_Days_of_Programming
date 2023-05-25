/******************************************************************************

Write a Porgram to Print no.of Spaces and Characters in a given input


input: Hello This is ABCD from XYZ city
output : No of Spaces : 6 and characters : 26

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	int space=0,ch=0;
	for(int i=0;i<s.length();i++)
	if(s.charAt(i)==' ') space++;
	else ch++;
	System.out.print("No of spaces : "+space);
	System.out.print(" and characters : "+ch);
	}
}
