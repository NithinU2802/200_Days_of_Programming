/******************************************************************************

Write a Java program to create a generic method that takes a list of numbers and 
returns the sum of all the even and odd numbers.

Input: 
[1, 2, 3, 4, 5, 6, 7]
[2.0, 1.5, 4.5, 2.5, 1.5]

Output:
First Input:
Even: 12.0
Odd: 16.0

Second Input:
Even: 2.0
Odd: 10.0

*******************************************************************************/
import java.util.*;

public class Main
{
    
    public static < T extends Number> void sum(List<T> input){
        double even=0,odd=0;
        for(T n:input)
        if(n.doubleValue()%2==0) even+=n.doubleValue();
        else odd+=n.doubleValue();
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
        System.out.println();
    }
	public static void main(String[] args) {
	List < Integer > integer = List.of(1, 2, 3, 4, 5, 6, 7);
    List < Double > doubles = List.of(2.0, 1.5, 4.5, 2.5, 1.5);
    System.out.println("First Input:");
    sum(integer);
    System.out.println("Second Input:");
    sum(doubles);
	}
}
