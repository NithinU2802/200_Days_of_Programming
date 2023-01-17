/*******************************************************************************


Inner reducing pattern

input: 4


output:
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4


*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int t=n,s=0,l=n+n-2;
	int[][] res=new int[n+n][n+n];
	while(t>0){
	for(int i=s;i<=l;i++){
	    for(int j=s;j<=l;j++){
	        if(i==s || i==l || j==s || j==l) res[i][j]=t;
	    }
	}
	t--;
	s++;
	l--;
	}
	for(int i=0;i<n+n-1;i++){
	for(int j=0;j<n+n-1;j++) System.out.print(res[i][j]+" "); System.out.println(); }
	}
}
