/******************************************************************************

 Combine two string using strinbuffer.
 
 
Input:
One 
Two 

Output:
One Two

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine(),a=x.nextLine();
	StringBuffer sb=new StringBuffer();
	for(int i=0;i<s.length();i++)
	sb.append(s.charAt(i));
	sb.append(' ');
	for(int i=0;i<a.length();i++)
	sb.append(a.charAt(i));
	System.out.println(sb.toString());
	}
}
