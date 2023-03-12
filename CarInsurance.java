/******************************************************************************

CarInsurance based on conditions..

if age is below 25 increase premium by 1000 and for each ticket make each ticket 
rate for 500.

Input:
Toyota

Camry

2018

5000

22

2


Output:
Make: Toyota

Model: Camry

Year: 2018

Premium: 5000.0

New Premium: 7000.0



Input:
Toyota

Camry 2018

5000

Output:
Make: Toyota

Model: Camry

Year: 2018

Premium: 5000.0

New Premium: 5000.0


*******************************************************************************/

import java.util.*;

class CarInsurance
{
private static String make;
private static String model;
private static int year;
private static double premium;
private static double nw_premium;

CarInsurance(String m,String n,int y,double p){
    make=m;
    model=n;
    year=y;
    premium=p;
}

public double calculatePermium(int age,int tickets){
    nw_premium=premium;
    if(age<25) nw_premium+=1000.0;
    for(int i=0;i<tickets;i++) nw_premium+=500.0;
    return nw_premium;
}
public void printDetails(){
    System.out.println("Make: "+make);
    System.out.println("Model: "+model);
    System.out.println("Year: "+year);
    System.out.println("Premium: "+premium);
    System.out.println("New Premium: "+nw_premium);
}
}
public class Main{
    public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String make=x.nextLine();
	String model=x.nextLine();
	int year=Integer.parseInt(x.nextLine());
	Double premium=Double.parseDouble(x.nextLine());
	int age=Integer.parseInt(x.nextLine());
	int tickets=Integer.parseInt(x.nextLine());
	CarInsurance car=new CarInsurance(make,model,year,premium);
	car.calculatePermium(age,tickets);
	car.printDetails();
	}
}
