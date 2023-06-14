/******************************************************************************

Write a Java program to create an enum called "DaysOfWeek" representing the days
of the week.

Output:
Monday

*******************************************************************************/

public class Main
{
    public enum day{Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday}
    
	public static void main(String[] args) {
	System.out.print("Today is "+day.Monday);
	}
}
