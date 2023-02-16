/******************************************************************************

print the elements in given pattern by int count....

Ip: n=5
Op:
1
1 1
2 1
1 2 1 1
1 1 1 2 2 1

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	String s="1";
	int c=1;
	System.out.println(s);
	while(c<n){
	    char d=s.charAt(0);
	    int j=0,ct=0;
	    String r="";
	    while(j<s.length()){
	        if(d==s.charAt(j)) ct++;
	        else{
	            r+=String.valueOf(ct)+String.valueOf(d);
	            System.out.print(ct+" "+d+" ");
	            d=s.charAt(j);
	            ct=1;
	        }
	        j++;
	    }
	    r+=String.valueOf(ct)+String.valueOf(d);
	    s=r;
	    System.out.print(ct+" "+d+" ");
	    System.out.println();
	    c++;
	}
	}
}
