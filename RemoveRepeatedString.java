/******************************************************************************

Remove Continously Repeating String in a array...

Input: I am very very famous

output: I am famous

Input: I had an an pen 

output: I had pen 

*******************************************************************************/
import java.util.*;

public class Main{
	public static void main(String[] args){
	Scanner x=new Scanner(System.in);
	String[] s=x.nextLine().split(" ");
	for(int i=0;i<s.length-1;i++){
	    if(s[i].equals(s[i+1])){
	        while(i+1<s.length && s[i].equals(s[i+1]) ) i++;
	        continue;
	    }
	    System.out.print(s[i]+" ");
	}
	int n=s.length;
	if(!s[n-2].equals(s[n-1])) System.out.print(s[n-1]);
	}
}
