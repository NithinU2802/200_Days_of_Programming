/******************************************************************************

Write a Java program to find and form  string by the non repeated character in a 
string and it length


Input:
pickoutthenonrepeatedstringchar

Sample Output:
kudsg 
5

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	char[] res=new char[s.length()];
	int[] alph=new int[128];
	int r=0,j=0;
	for(int i=0;i<s.length();i++){
	    if(alph[s.charAt(i)]==-1) continue;
	    alph[s.charAt(i)]++;
	    if(alph[s.charAt(i)]==1) res[r++]=s.charAt(i);
	    else{
	        j=r;
	        while(j-->=0){
	            if(res[j]==s.charAt(i)){
	                while(j<r-1) res[j]=res[++j]; 
	                break;
	            }
	        }
	        r--;
	        alph[s.charAt(i)]=-1;
	    }
	}
	String result=new String(res,0,r);
	System.out.println(result+"\n"+r);
	}
}
