package Programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trywithmultiplecatch {

	public trywithmultiplecatch() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) throws Exception,ArithmeticException,InputMismatchException {
	Scanner sc= new Scanner(System.in);
	int a=10;
	System.out.println("Enter the disvisor");
	
	try
	{
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Cannot divide a number by zero");
	}
	catch (InputMismatchException e) {
		System.out.println("Invalid input");
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
	
}
}
