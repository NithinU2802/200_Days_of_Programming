/******************************************************************************

Sort elements based on their sum

Input: 11 12 43 51

Output: 11 12 51 43


Input: 21 12 43 34

output: 12 21 24 43

*******************************************************************************/

import java.util.*;

public class Main
{
    
    public static int sum(int a){
        int s=0;
        while(a>0){
            s+=a%10;
            a/=10;
        }
        return s;
    }
    
    public static void sort(int[] b,int[] s){
        for(int i=0;i<s.length-1;i++){
            if(s[i]>s[i+1]){
                s[i]^=s[i+1];
                s[i+1]^=s[i];
                s[i]^=s[i+1];
                b[i]^=b[i+1];
                b[i+1]^=b[i];
                b[i]^=b[i+1];
                i=-1;
            }
            else if(s[i]==s[i+1]){
                s[i]^=s[i+1];
                s[i+1]^=s[i];
                s[i]^=s[i+1];
                b[i]^=b[i+1];
                b[i+1]^=b[i];
                b[i]^=b[i+1];
                //i=-1;
            }
        }
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] a=x.nextLine().split(" ");
	int[] b=new int[a.length];
	int[] s=new int[a.length];
	int n=0;
	for(String i: a){ 
	    b[n]=Integer.parseInt(i);
	    s[n]=sum(b[n++]);
	}
	sort(b,s);
	for(int i=0;i<b.length;i++) System.out.print(b[i]+" ");
	}
}
