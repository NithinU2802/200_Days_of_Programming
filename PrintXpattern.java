/******************************************************************************

program to print the following output for the given input. You can assume the 
string is of odd length

Input: 12345

Output: 
1   5 
 2 4
  3 
 2 4 
1   5


*******************************************************************************/

import java.util.*;

public class Main
{
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String st=x.nextLine();
	int s=0,e=st.length()-1;
	for(int i=0;i<st.length();i++){
	    for(int j=0;j<st.length();j++){
	    if(s==j || e==j) System.out.print(st.charAt(i));
	    else System.out.print(" ");
	    }
	    System.out.println();
	    s++;
	    e--;
	}
	}
}
