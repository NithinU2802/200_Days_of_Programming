/******************************************************************************

Sort element odd digits in descending and even integers in ascending order....

Input: 13 2 4 15 12 10 5

Output: 13 2 12 10 5 15 4


Input: 1 2 3 4 5 6 7 8 9

Output: 9 2 7 4 5 6 3 8 1


*******************************************************************************/

import java.util.*;

public class Main
{
    public static void sort(int[] a){
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                int t=a[i];
                a[i]=a[i+1];
                a[i+1]=t;
                i=-1;
            }
        }
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] s=x.nextLine().split(" ");
	int[] a=new int[s.length];
	int n=0;
	for(String i: s) a[n++]=Integer.parseInt(i);
	int h=s.length/2;
	int[] even=new int[h];
	if(s.length%2!=0) h++;
	int[] odd=new int[h];
	int o=0,e=0;
	for(int i=0;i<s.length;i++){
	    if(i%2==0) odd[o++]=a[i];
	    else even[e++]=a[i];
	}
	sort(odd);
	sort(even);
	e=0;
	for(int i=0;i<s.length;i++){
	    if(i%2==0) System.out.print(odd[--o]+" ");
	    else System.out.print(even[e++]+" ");
	}
	}
}
