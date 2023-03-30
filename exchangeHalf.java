/******************************************************************************

Exchange second half with first half of string...

Input:
Nithinu

Output:
hinuNit

Input:
FirstFirst

Output:
FirstFirst

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	s=s.substring(s.length()/2,s.length())+s.substring(0,s.length()/2);
	System.out.println(s);
	}
}
