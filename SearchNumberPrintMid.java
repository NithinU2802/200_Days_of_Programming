/******************************************************************************

print Middle or both Middle element based on odd and even number of elements...

Input: 34ndu56ejmd98nd
Output: 56


Input: djnd34ndhb65dmdjk87due23djnf9dnf2
Output: 87 23


Input: 76djnf39ndjnfj23fd20dj72dj
Output: 23


*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine(),r="";
	int[] res=new int[101];
	int n=0;
	for(int i=0;i<s.length();i++){
	    if(Character.isDigit(s.charAt(i))) r+=s.charAt(i);
	    else if(Character.isAlphabetic(s.charAt(i))){
	        if(r.length()==0) continue;
	        res[n++]=Integer.parseInt(r);
	        r="";
	    }
	}
	if(r.length()!=0) res[n++]=Integer.parseInt(r);
	if(n%2!=0) System.out.print(res[n/2]);
	else System.out.print(res[(n/2)-1]+" "+res[(n/2)]);
	}
}
