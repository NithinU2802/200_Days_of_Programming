/******************************************************************************

Regular expression to check whether the string contains vowels.

Input:
Hello 

Output:
2

Input:
TV 

Output:
-1

*******************************************************************************/
import java.util.*;

public class Main
{
    static boolean isvowel(char a){
        return String.valueOf(Character.toLowerCase(a)).matches(".*[aeiou].*");
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	int res=0;
	for(int i=0;i<s.length();i++)
	    if(isvowel(s.charAt(i))) res++;
	System.out.println(res==0?-1:res);
	}
}
