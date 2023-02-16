/******************************************************************************

Find if a String2 is substring of String1. If it is, return the index of the 
first occurrence. else return -1.

Input: test123string
       123
Output: 4

Input: testing12
       1234
Output: -1

*******************************************************************************/
import java.util.*;

public class Main
{
    
    public static int check(String s,String a){
        int j=0,t=0,r=0;
        for(int i=0;i<s.length();i++){
            if(j<a.length() && s.charAt(i)==a.charAt(j)) j++;
            else{
                if(j==a.length()) return r;
                r=i+1;
                j=0;
            }
        }
        if(j==a.length()) return r;
        return -1;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine().trim();
	String a=x.nextLine().trim();
	System.out.print(check(s,a));
	}
}
