/******************************************************************************

      Write a Java program to create a vehicle class hierarchy. The base class 
should be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should 
have properties such as make, model, year, and fuel type. Implement methods for 
calculating fuel efficiency, distance traveled, and maximum speed.

VEHCILE MANAGEMENT SYSTEM
1. Car 
2. Truck
3. Motorcycle
4. Exit

2
Company: Tatra
Model: Tatra 810 4x4
Year: 2020
Fuel type: GASOLINE 
Fuel Efficiency: 8.112
Cargo Capacity: 4.5

Truck Model: Tatra 810 4x4
Fuel Efficiency: 8.075659532105526 mpg
Distance Traveled: 65.50975012444003 miles
Max Speed: 80.0 mph

VEHCILE MANAGEMENT SYSTEM
1. Car 
2. Truck
3. Motorcycle
4. Exit

1
Company: Volkswagen
Model: Virtus
Year: 2019
Fuel type: HYBRID 
Fuel Efficiency: 6.123
Seat Capacity: 8


Car Model: Virtus
Fuel Efficiency: 2.355 mpg
Distance Traveled: 14.419665 miles
Max Speed: 120.0 mph

VEHCILE MANAGEMENT SYSTEM
1. Car 
2. Truck
3. Motorcycle
4. Exit

3 
Company: Massimo Motor
Model: Warrior200
Year: 2018
Fuel type: GASOLINE 
Fuel Efficiency: 2.1

Motorcycle Model: Warrior200
Fuel Efficiency: 2.1 mpg
Distance Traveled: 4.41 miles
Max Speed: 80.0 mph

VEHCILE MANAGEMENT SYSTEM
1. Car 
2. Truck
3. Motorcycle
4. Exit

4
Thank You...!

*******************************************************************************/

import java.util.*;

class Vehicle{
    String make;
    String model;
    int year,seat;
    String type;
    float efficiency,distance,speed;
    Vehicle(String make,String model,int year,String type,float efficiency){
        this.make=make;
        this.model=model;
        this.year=year;
        this.seat=seat;
        this.type=type;
        this.efficiency=efficiency;
    }
    
}



class Truck extends Vehicle{
    Truck(String make,String model,int year,String type,float efficiency,float cargo){
        super(make,model,year,type,efficiency);
    }
  
   String getModel(){
       return make+" "+model;
   }
   
   float getEfficiency(){
       return (float)((efficiency*1.0)*(1.0/(1.0+(seat/5.0))));
   }
   
   float getDistance(){
       return getEfficiency()*efficiency;
   }
   
   float getSpeed(){
       return (float)120.0;
   }
    
}


class Car extends Vehicle{
    int seat;
    Car(String make,String model,int year,String type,float efficiency,int seat){
        super(make,model,year,type,efficiency);
        this.seat=seat;
    }
    
    String getModel(){
       return make+" "+model;
   }
   
   float getEfficiency(){
       return (float)((efficiency*1.0)*(1.0/(1.0+(seat/5.0))));
   }
   
   float getDistance(){
       return getEfficiency()*efficiency;
   }
   
   float getSpeed(){
       return (float)120.0;
   }
    
}



class Motorcycle extends Vehicle{
    Motorcycle(String make,String model,int year,String type,float efficiency){
        super(make,model,year,type,efficiency);
    }
    
    String getModel(){
       return make+" "+model;
   }
   
   float getEfficiency(){
       return (float)((efficiency*1.0)*(1.0/(1.0+(seat/5.0))));
   }
   
   float getDistance(){
       return getEfficiency()*efficiency;
   }
   
   float getSpeed(){
       return (float)120.0;
   }
}

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n;
	int year,seat;
	String company,model,type;
	float eff,cargo;
	do{
	    System.out.println("\n\nVECHCLE MANAGEMENT SYSTEM\n1.Car\n2.Truck\n3.Motorcycle\n4.Exit\n\n");
	    n=x.nextInt();
	    switch(n){
	        case 1:
	            System.out.print("Company: ");
	            company=x.next();
	            System.out.print("Model: ");
	            model=x.next();
	            System.out.print("Year: ");
	            year=x.nextInt();
	            System.out.print("Fuel type: ");
	            type=x.next();
	            System.out.print("Fuel Efficiency: ");
	            eff=x.nextFloat();
	            System.out.print("Seat Capacity: ");
	            seat=x.nextInt();
	            Car car=new Car(company,model,year,type,eff,seat);
	            System.out.print("\n");
	            System.out.println("Truck Model: "+car.getModel());
	            System.out.println("Fuel Efficiency: "+car.getEfficiency()+" mpg");
	            System.out.println("Distance Traveled: "+car.getDistance()+" miles");
	            System.out.println("Max Speed: "+car.getSpeed()+" mph");
	            break;
	        case 2:
	            System.out.print("Company: ");
	            company=x.next();
	            System.out.print("Model: ");
	            model=x.next();
	            System.out.print("Year: ");
	            year=x.nextInt();
	            System.out.print("Fuel type: ");
	            type=x.next();
	            System.out.print("Fuel Efficiency: ");
	            eff=x.nextFloat();
	            System.out.print("Cargo Capacity: ");
	            cargo=x.nextFloat();
	            Truck truck=new Truck(company,model,year,type,eff,cargo);
	            System.out.print("\n");
	            System.out.println("Truck Model: "+truck.getModel());
	            System.out.println("Fuel Efficiency: "+truck.getEfficiency()+" mpg");
	            System.out.println("Distance Traveled: "+truck.getDistance()+" miles");
	            System.out.println("Max Speed: "+truck.getSpeed()+" mph");
	            break;
	       case 3:
	            System.out.print("Company: ");
	            company=x.next();
	            System.out.print("Model: ");
	            model=x.next();
	            System.out.print("Year: ");
	            year=x.nextInt();
	            System.out.print("Fuel type: ");
	            type=x.next();
	            System.out.print("Fuel Efficiency: ");
	            eff=x.nextFloat();
	            Motorcycle motorcycle=new Motorcycle(company,model,year,type,eff);
	            System.out.print("\n");
	            System.out.println("Truck Model: "+motorcycle.getModel());
	            System.out.println("Fuel Efficiency: "+motorcycle.getEfficiency()+" mpg");
	            System.out.println("Distance Traveled: "+motorcycle.getDistance()+" miles");
	            System.out.println("Max Speed: "+motorcycle.getSpeed()+" mph");
	            break;
	       default:
	            System.out.println("Invalid Option\n");
	            
	    }
	}while(n!=4);
	    System.out.println("\nThank You...!\n");
	}
}
