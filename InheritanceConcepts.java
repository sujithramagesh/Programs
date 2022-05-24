package Programs;

import java.util.Scanner;

public class InheritanceConcepts {
public static void main(String[] args) {
	System.out.println("Start");
	VolksWagon vw=new VolksWagon();
	vw.drive();
	System.out.println("End");
}
}
class Vehicle
{
	int noOfWheels;
	int noOfDoors;
	String vehicleName;
	public void drive()
	{
		System.out.println("Inside vehicle class");
		
		/*
		 * Scanner sc=new Scanner(System.in);
		 * System.out.println("Enter the number of wheels,Doors and Vehicle Name");;
		 * noOfWheels=sc.nextInt(); noOfDoors=sc.nextInt(); vehicleName=sc.next();
		 */
		//System.out.println("Vehicle is driving with "+noOfWheels+" wheels, "+noOfDoors+" doors and "+vehicleName+" is its name");
	}
	
}
class Car extends Vehicle
{
	@Override
	public void drive()
	{
		
		System.out.println("Inside Car class");
		super.drive();
	}
}
class VolksWagon extends Car
{
	
	public void drive()
	{
		System.out.println("Inside Volkswagonclass");
		super.drive();
	}
	
}
