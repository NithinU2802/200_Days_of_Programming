/******************************************************************************* 

Remove k consecutive count of elements....

Input: rrrrrttt 2
output: rt 

Input: jjkrrrn 3
output: jjkn 

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.next();
	int n=x.nextInt();
	char d=s.charAt(0);
	int c=0;
	for(int i=0;i<s.length();i++){
	    if(d!=s.charAt(i)){ 
	        for(int j=0;j<c;j++) System.out.print(d);
	        c=1;
	        d=s.charAt(i);
	        continue;
	    }
	    c++;
	    if(c==n) c=0;
	}
	for(int i=0;i<c;i++) System.out.print(d);
	}
}
