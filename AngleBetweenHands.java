/******************************************************************************

    Write a Java program to find the angle between the hour and minute hands
    
Input:
3 00

Output:
90

Input:
12 30 

Output:
165

*******************************************************************************/

import java.util.*;

public class Main
{
    public static int angle(int h,int m){
    if(h==12) h=0;
    if(m==60) m=0;
    int hr=(int)(0.5*(h*60+m));
    int mi=(int)(6*m);
    int angle=Math.abs(hr-mi);
    return angle>360-angle?360-angle:angle;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int h=x.nextInt(),m=x.nextInt();
	System.out.print(angle(h,m));
	}
}
