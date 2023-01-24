/******************************************************************************

Characters between vowels - Reverse 

The program must accept a string s as the input.
For each vowel from right to left in the string, the program must print the 
characters between the current vowel(inclusive) and the next vowel(exclusive).


Input: Manager 

Output:
er 
ag 
an 


Input: PEN 

output:
EN 


Input: apple 

Output:
e 
appl 

Input: aeiou 

Output:
u
O 
i 
e 
a 

*******************************************************************************/
import java.util.*;

public class Main
{
    
    public static boolean vowel(char a){
        a=Character.toLowerCase(a);
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u') return true;
        return false;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	String[] a=new String[1001];
	int n=0,f=0,k=0;
	String r="";
	for(int i=0;i<s.length();i++){
	    if(vowel(s.charAt(i))){ f++; }
	    if(f==1) r+=s.charAt(i);
	    if(f==2){
	        f=1;
	        a[k++]=r;
	        r="";
	        r+=s.charAt(i);
	    }
	}
	if(f==1) a[k++]=r;
	for(int i=k-1;i>=0;i--) System.out.println(a[i]);
	}
}
