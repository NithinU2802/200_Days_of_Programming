/******************************************************************************
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character 
preserving the order of characters. No two characters may map to the same character, 
but a character may map to itself.


Input: s = "egg", t = "add"
Output: true

Input: s = "foo", t = "bar"
Output: false

Input: s = "paper", t = "title"
Output: true

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s1=x.next(),s2=x.next();
	
	if(s1.length()!=s2.length()){
	    System.out.print("FALSE");
	    return;
	}
	
	int[] a=new int[257];
	boolean[] b=new boolean[257];
	for(int i=0;i<s1.length();i++){
	    if(a[s1.charAt(i)]==0){
	        if(b[s2.charAt(i)]==true){
	            System.out.print("FALSE");
	            return;
	        }
	        b[s2.charAt(i)]=true;
	        a[s1.charAt(i)]=s2.charAt(i);
	    }else if(a[s1.charAt(i)]!=s2.charAt(i)){
	        System.out.print("FALSE");
	        return;
	    }
	}
	System.out.print("TRUE");
	}
}
