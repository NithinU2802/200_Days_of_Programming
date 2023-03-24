/******************************************************************************

Analyse how the output is derived from the input and write a program
to print the output...

Input: [2,1,0,-8,-9]

output: [0.4,0.2,0.4]

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] s=x.nextLine().split(",");
	int[] a=new int[s.length];
	int k=0;
	s[0]=s[0].substring(1,s[0].length());
	s[s.length-1]=s[s.length-1].substring(0,s[s.length-1].length()-1);
	for(int i=0;i<s.length;i++)
	    a[k++]=Integer.parseInt(s[i]);
	int p=0,n=0,z=0;
	for(int i=0;i<a.length;i++)
	if(a[i]==0) z++;
	else if(a[i]>0) p++;
	else n++;
	int tot=s.length;
	double r1=((p*1.0)/(tot*1.0)),r2=((n*1.0)/(tot*1.0)),r3=((z*1.0)/(tot*1.0));
	System.out.println("["+r1+","+r3+","+r2+"]");
	
	}
}
