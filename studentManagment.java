/******************************************************************************

Input: 
No of Student: 4

Student 1:
Roll No: 71
Name: sam
GPA: 8.56

Student 2:
Roll No: 61
Name: Ram
GPA: 7.56

Student 3:
Roll No: 77
Name: Karan
GPA: 9.56

Student 4:
Roll No: 79
Name: Raju
GPA: 6.56

Output:

Student 1:
Roll No: 71
Name: sam
CGPA: 8.56

Student 2:
Roll No: 61
Name: Ram
CGPA: 7.56

Student 3:
Roll No: 77
Name: Karan
CGPA: 9.56

Student 4:
Roll No: 79
Name: Raju
CGPA: 6.56


*******************************************************************************/

import java.util.*;

public class Main
{
    static class Student{
        int roll;
        String name;
        float gpa;
    };
    
	public static void main(String[] args){
	Scanner x=new Scanner(System.in);
	System.out.print("No of Student: ");
	int n=Integer.parseInt(x.nextLine());
	Student[] s=new Student[n];
	for(int i=0;i<n;i++){
	    s[i]=new Student();
	    System.out.println("Student "+(i+1));
	    System.out.println("Roll No: ");
	    s[i].roll=Integer.parseInt(x.nextLine());
	    System.out.println("Name: ");
	    s[i].name=x.nextLine();
	    System.out.println("CGPA: ");
	    s[i].gpa=Float.parseFloat(x.nextLine());
	}
	System.out.println();
	for(int i=0;i<n;i++){
	    System.out.println("Student "+(i+1));
	    System.out.println("Roll No: "+s[i].roll);
	    System.out.println("Name: "+s[i].name);
	    System.out.println("CGPA: "+s[i].gpa);
	    System.out.println();
	}
	}
}
