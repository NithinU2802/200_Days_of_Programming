/******************************************************************************

print elements of String multiple of k.........

Input: orange 4

output: nre 

Input: Nithin 2

Output: ihn 

Input: onetwo 5

output: wtenoo

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.next();
	int n=x.nextInt();
	int[] r=new int[s.length()];
	int t=n,i=-1,k=0;
	String res="";
	if(n==0) res+=s.charAt(0);
	else
	while(true){
	    t=n;
	    while(t>0){
	        i++;
	        if(i==s.length()) i=0;
	        t--;
	    }
	    int f=0;
	    for(int j=0;j<k;j++)
	    if(r[j]==i){ f=1; break; }
	    if(f==1) break;
	    res+=s.charAt(i);
	    r[k++]=i;
	    if(k==s.length()) break;
	}
	System.out.print(res);
	}
}
