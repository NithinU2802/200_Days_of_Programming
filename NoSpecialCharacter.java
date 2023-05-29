/******************************************************************************

Write a Java program to check whether a string contains only a certain set of 
characters (in this case a-z, A-Z and 0-9).

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	System.out.print(s.matches("^[\\w]+$"));
	}
}
