/******************************************************************************

Check character segregation....

Input:
a 

Output:
Lowercase character

Input:
&

Ouput:
Special character

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	char s=x.next().charAt(0);
	if(Character.isAlphabetic(s)){
	    if(Character.isLowerCase(s)) 
	    System.out.println("Lowercase character");
	    else 
	    System.out.println("Uppercase character");
	}else if(Character.isDigit(s))
	System.out.println("Number");
	else
	System.out.println("Special character");
	}
}
