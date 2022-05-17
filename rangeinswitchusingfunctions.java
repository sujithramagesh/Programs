package Programs;

import java.util.Scanner;

public class rangeinswitchusingfunctions {

	public rangeinswitchusingfunctions() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(Switch(n))
		{
		case 0:
			System.out.println("The number is between 0 and 10");
			break;
		case 1:
			System.out.println("The number is between 11 and 100");
			break;
		case 2:
			System.out.println("The number is greater than 100");
			break;
		}
	}
	private static int Switch(int n) {
		// TODO Auto-generated method stub
		if(0<=n&&n<=10)
		{
			return 0;
		}
		else if(11<=n&&n<=100)
			return 1;
		else
		return 2;
		
	}
}
