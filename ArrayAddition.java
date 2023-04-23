/******************************************************************************

Addition operation implemented through arrays....

Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]


Input: num = [2,7,4], k = 181
Output: [4,5,5]


Input: num = [2,1,5], k = 806
Output: [1,0,2,1]


*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] s=x.nextLine().split(" ");
	int[] a=new int[s.length];
	String r="";
	for(String i: s) r+=i;
	int n=Integer.parseInt(r);
	String t=x.nextLine();
	int m=Integer.parseInt(t);
	int res=n+m;
	n=String.valueOf(res).length();
	int i=n-1;
	int[] rs=new int[i+1];
	while(res!=0){
	    rs[i--]=res%10;
	    res/=10;
	}
	for(int j=0;j<n;j++) System.out.print(rs[j]+" ");
	}
}
