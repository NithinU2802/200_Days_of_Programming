/******************************************************************************

Write a Java program that returns the largest integer but not larger than the 
base-2 logarithm of a specified integer.

Input: 2350 
Output : 11

Finding the shift count to make n as zero to deliver the value greater and lesser 
than the log base 2 of given number.

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String[] a){
    Scanner x=new Scanner(System.in);
    int n=x.nextInt();
    int shift=(int)(Math.log(n)/Math.log(2)); 
    System.out.println(shift);
    }
}
