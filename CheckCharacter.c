/******************************************************************************

Check whether the character is vowel or consonant...

Input:
A 

Output:
A :vowel

Input:
b 

Output:
b: consonant

*******************************************************************************/

import java.util.*;

public class Main
{
    public static boolean alph(char a){
        a=Character.toLowerCase(a);
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
        return true;
        return false;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	char s=x.next().charAt(0);
	Main ob=new Main();
	if(!Character.isAlphabetic(s)){
	    System.out.println("Invalid Input");
	    return;
	}
	if(ob.alph(s)) System.out.println(s+" :vowel");
	else System.out.println(s+" :consonant");
	}
}
