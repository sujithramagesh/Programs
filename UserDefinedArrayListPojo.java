package Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Programs.ChildGrandChild.Family;

public class UserDefinedArrayListPojo {

	public UserDefinedArrayListPojo() {
		// TODO Auto-generated constructor stub
	}
	static ArrayList<EmployeePojo> employee=new ArrayList<EmployeePojo>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		getEmployeeDetail(sc);
		printEmployeeDetail();
		System.out.println("Enter the employee ID");
		int userTempId=sc.nextInt();
		getEmployeeRow(userTempId);
		sc.close();
	}
	public static void getEmployeeRow(int userTempId)
	{
		for(EmployeePojo emp:employee)
		{
			if(emp.getEmployeeId()==userTempId)
			{
				System.out.println(emp.toString() );
			}
		}
	}
	public static void getEmployeeDetail(Scanner sc)
	{
		EmployeePojo emp=new EmployeePojo();
		System.out.println("Enter the Employee Name,Age and Phone Number");
		System.out.println("Please enter 'END' to stop giving input ");
		int empId=1001;
		String str="";
		do
		{
			
			str=sc.nextLine();
			String[] names = str.split(" ");
			if(names.length>1)
			{
					emp.setEmployeeId(empId++);
					emp.setEmployeeName(names[0]);
					emp.setEmployeeAge(Integer.parseInt(names[1]));
					emp.setEmployeePhoneNumber(Long.parseLong(names[2]));
					employee.add(emp);
			}
		}while(!(str.equals("END")));
		
		
		
	}
	public static void printEmployeeDetail()
	{
		System.out.println("EmpId_____EmpName_______EmpAge_____EmpPhoneNumber");
		for(EmployeePojo link:employee)
		{
			System.out.print(link.getEmployeeId()+"      "+link.getEmployeeName()+"        "+link.getEmployeeAge()+"      "+link.getEmployeePhoneNumber());
			System.out.println();
		};
		
	}
}
