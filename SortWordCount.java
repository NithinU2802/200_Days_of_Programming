/******************************************************************************

Write a program to read a string / sentence and output the number 
of times each word occurs in the entire text. At the end, the output 
should be sorted into ascending order words along with usage of words.
You may assume that the entire text is in capitals (you may also 
convert in capitals for your betterment) and each word is followed 
by a blank space except the last one, which is followed by a full stop.
Let there be at the most 50 words in the text.

Test your program for the given sample data and also some other random data:


Input:
YOU ARE GOOD WHEN YOUR THOUGHTS ARE GOOD AND YOUR DEEDS ARE GOOD.

Output:

Words	Word Count
And     	1
Are	      3
Deeds	    1
Good	    3
Thoughts	1
When	    1
You	      1
Your	    2


Input:
IF YOU FAIL TO PLAN YOU ARE PLANNING TO FAIL.

Output:

Words	Word Count
Are	      1
Fail	    2
If	      1
Plan	    1
Planning  1
To	      2
You	      2

*******************************************************************************/

import java.util.*;

public class Main
{
    static void sort(String[] a,int n){
        for(int i=0;i<n-1;i++){
            int k=0,l=0;
            while(k<a[i].length() && l<a[i+1].length()){
                if(a[i].charAt(k)!=a[i+1].charAt(l)) break;
                k++;
                l++;
            }
            if(k==l && k==a[i].length()) continue;
            if(a[i].charAt(k)>a[i+1].charAt(l) || (l==a[i+1].length())){ 
                swap(a,i,i+1);
            i=-1;
            }
        }
    }
    
    static void swap(String[] a,int i,int j){
        String t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    
    static void freq(String[] a,String[] b,int m,int n){
        int c=5,r=0;
        System.out.print("Words");
        while(c<=m+1){ System.out.print(" "); c++; }
        System.out.println("Word Count");
        for(int i=0;i<n;i++){
            c=a[i].length();
            System.out.print(a[i]);
            while(c<=m+1){ System.out.print(" "); c++; }
            r=0;
            for(int j=0;j<b.length;j++){
            if(a[i].equals(b[j])) r++;
            }
            for(int j=0;j<4;j++) System.out.print(" ");
            System.out.print(r);
            System.out.println();
        }
    }
    
    static int max(String[] a,int n){
        int m=0;
        for(int i=0;i<n;i++){
            if(a[i].length()>m) m=a[i].length();
        }
        return m;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String d=x.nextLine();
	d=d.replaceAll("\\.", "");
	String[] s=d.split(" ");
	int n=0;
	String[] a=new String[s.length];
	for(int i=0;i<s.length;i++){
	    int f=0;
	    for(int j=0;j<n;j++)
	    if(a[j].equals(s[i])){ f=1; break; }
	    if(f==0)  a[n++]=s[i];
	}
	sort(a,n);
	int m=max(a,n);
	freq(a,s,m,n);
	}
}
