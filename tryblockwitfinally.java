package Programs;

import java.util.Scanner;

public class tryblockwitfinally {

	public tryblockwitfinally() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		try
		{
			System.out.println("Inside try block");
			System.out.println(method());
		}
		finally
		{
			System.out.println("Inside finally block");
		}
		Scanner sc= new Scanner(System.in);
		int a=10;
		System.out.println("Enter the disvisor");
		try
		{
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		finally
		{
			System.out.println("Only finally");
		}
	}
	public static int method()
	{
		
		try{
			System.out.println("Inside method try");
			return 10;
		}
		finally
		{
			System.out.println("Inside method finally");
		}
	}

}
