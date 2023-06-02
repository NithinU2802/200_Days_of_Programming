/******************************************************************************

 Write a Java program to print all permutations of a given string with repetition.

Input:
PQR

Output:
PPP
PPQ
PPR
...
RRP
RRQ
RRR

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	int n=s.length();
	ArrayList<String> a=new ArrayList<String>();
	permutation(s,"",a);
	for(String i:a)
	System.out.println(i);
	}
	
	public static void permutation(String s,String r,List<String> res){
	    if(r.length()==s.length()){
	        res.add(r);
	        return;
	    }
	    for(int i=0;i<s.length();i++)
	    permutation(s,r+s.charAt(i),res);
	}
}
