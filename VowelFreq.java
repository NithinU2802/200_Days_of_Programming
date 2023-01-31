/******************************************************************************

Program to print frequency of vowels in descending order from the given 
sentence...

Input: Welcome to ZOHO.

Output: 

o-4
E-2


Input: rhythms.....

Output: -1

*******************************************************************************/
import java.util.*;

public class Main
{
    
    public static boolean isvowel(char a){
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u') return true;
        return false;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	int[][] v=new int[5][2];
	for(int i=0;i<5;i++) v[i][0]=i; 
	boolean f=false;
	for(int i=0;i<s.length();i++){
	    char a=Character.toLowerCase(s.charAt(i));
	    if(isvowel(a)) f=true;
	    if(a=='a') v[0][1]++;
	    else if(a=='e') v[1][1]++;
	    else if(a=='i') v[2][1]++;
	    else if(a=='o') v[3][1]++;
	    else if(a=='u') v[4][1]++;
	}
	if(f){
	    for(int i=0;i<4;i++){
	        if(v[i][1]<v[i+1][1]){
	            int t=v[i][1];
	            v[i][1]=v[i+1][1];
	            v[i+1][1]=t;
	            t=v[i][0];
	            v[i][0]=v[i+1][0];
	            v[i+1][0]=t;
	            i=-1;
	        }
	    }
	    
	    for(int i=0;i<5;i++){
	        int a=v[i][0];
	        if(a==0 && v[i][1]!=0) System.out.println("A-"+v[i][1]);
	        else if(a==1 && v[i][1]!=0) System.out.println("E-"+v[i][1]);
	        else if(a==2 && v[i][1]!=0) System.out.println("I-"+v[i][1]);
	        else if(a==3 && v[i][1]!=0) System.out.println("O-"+v[i][1]);
	        else if(a==4 && v[i][1]!=0) System.out.println("U-"+v[i][1]);
	    }
	    
	    
	}else System.out.print("-1");
	
	}
}
