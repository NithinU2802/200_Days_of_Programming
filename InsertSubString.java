/******************************************************************************

    Insert string into string by index.

Input:
Insert into string
sub
7
Output:
Insert sub into string

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String string=x.nextLine();
	String sub=x.nextLine();
	int n=x.nextInt();
	String res=new String();
	int j=0;
	for(int i=0;i<string.length();i++){
	    if(i==n){
	        j=0;
	        while(j<sub.length()){
	            res+=sub.charAt(j);
	            j++;
	        }
	    }
	    res+=string.charAt(i);
	}
	System.out.println(res);
	}
}
