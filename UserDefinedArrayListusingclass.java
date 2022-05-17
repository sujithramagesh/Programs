package Programs;

import java.util.ArrayList;
import java.util.Scanner;

public class UserDefinedArrayListusingclass {

	public UserDefinedArrayListusingclass() {
		// TODO Auto-generated constructor stub
	}
	static ArrayList<EmployeeClass> employee=new ArrayList<EmployeeClass>();
	public static void main(String[] args) {
		EmployeeClass emp1=new EmployeeClass(997,"Ravi",30, 9876421345l);
		EmployeeClass emp2=new EmployeeClass(998,"Raju",22, 9876421345l);
		EmployeeClass emp3=new EmployeeClass(999,"Reka",29, 9876421345l);
		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);
		getEmployeeDetail();
		
	

	}
	public static void getEmployeeDetail()
	{
		Scanner sc=new Scanner(System.in);
		int n=0;
		while(n!=3)
		{
		System.out.println("Enter the option");
		System.out.println("1.Insert New employeenrecord");
		System.out.println("2.Retrieve any one employee record");
		System.out.println("3.Exit");
		 n=sc.nextInt();
		sc.nextLine();
		int empId=1001;
		switch (n) {
		case 1: {
			System.out.println("Enter Name:");
			String name=sc.next();
			System.out.println("Enter Age:");
			int age=sc.nextInt();
			System.out.println("Enter phone Number");
			Long phonenumber=sc.nextLong();
			/*
			 * while(phonenumber.SIZE!=10) {
			 * System.out.println("Enter a valid phone number"); phonenumber=sc.nextLong();
			 * }
			 */
			EmployeeClass emp=new EmployeeClass(empId++,name,age, phonenumber);
			employee.add(emp);
			printEmployeeDetail();
			break;
		}
		case 2:
		{
			System.out.println("Enter the employee ID");
			int userTempId=sc.nextInt();
			getEmployeeRow(userTempId);
			break;
		}

		case 3:
			break;
		}
		}
		}
		public static void printEmployeeDetail()
		{
			System.out.println("EmpId_____EmpName_______EmpAge_____EmpPhoneNumber");
			for(EmployeeClass link:employee)
			{
				System.out.print(link.employeeId+"      "+link.employeeName+"        "+link.employeeAge+"      "+link.employeePhoneNumber);
				System.out.println();
			}
		}
		public static void getEmployeeRow(int userTempId)
		{
			for(EmployeeClass emp:employee)
			{
				if(emp.employeeId==userTempId)
				{
					System.out.println(emp.toString() );
				}
			}
		}

	}
