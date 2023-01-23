/******************************************************************************

You are given a string s consisting of lowercase letters. The letters a to z are
assigned the value of 1-26 respectively. The program is to find the sum of the 
string (No.Of.times the letter repeated in the string*value of the letter).


Input: babca

output: 9


Input: abcd

output: 10

Input: zz

output: 52


*******************************************************************************/
import java.util.*;

public class Main
{
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	int t=0,sum=0;
	for(int i=0;i<s.length();i++){
	    if(Character.isUpperCase(s.charAt(i))) t=s.charAt(i)-64;
	    else if(Character.isLowerCase(s.charAt(i))) t=s.charAt(i)-96;
	    else continue;
	    sum+=t;
	}
	System.out.print(sum);
	}
}
