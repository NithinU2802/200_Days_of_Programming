/******************************************************************************


count maximum distinct element subsize in array....

Input: 4 2 4 1 4 3 4
Output: 3 

Input: 2 1 5 4 3
Output: 5


Note: this program is only applicable for positive integers...

*******************************************************************************/

import java.util.*;

public class Main
{
    
    public static int max(int[] a){
        int m=0;
        for(int i=0;i<a.length;i++)
        if(a[i]>m) m=a[i];
        return m;
    }
    
    public static int subSizeMaximum(int[] a){
        int m=max(a);
        int res=0;
        for(int i=0;i<a.length;i++){
            int[] v=new int[m+1];
            int c=0;
            for(int j=i;j<a.length;j++)
            if(v[a[j]]>=1) break; else{
                c++;
                v[a[j]]++;
            }
            if(res<c) res=c;
        }
        return res;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] s=x.nextLine().split(" ");
	int[] a=new int[s.length];
	int n=0;
	for(String i:s) a[n++]=Integer.parseInt(i);
	System.out.println(subSizeMaximum(a));
	}
}
