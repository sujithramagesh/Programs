package Programs;

import java.util.Scanner;

public class startriangle {

	public startriangle() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows=sc.nextInt();
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<rows-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=rows-i;j<=rows;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
