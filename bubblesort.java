package Programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Bubblesort {

	public Bubblesort() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size");
	int size=sc.nextInt();
	System.out.println("Enter the array elements");
	ArrayList<Integer> arrList=new ArrayList<Integer>();
	for(int i=0;i<size;i++)
	{
		arrList.add(sc.nextInt());
	}
	for(int i=0;i<size-1;i++)
	{
		for(int j=0;j<size;j++)
		{
			if((j+1<=size-1)&&arrList.get(j)>arrList.get(j+1)) {
				int temp=arrList.get(j);
				arrList.set(j,arrList.get(j+1));
				arrList.set(j+1, temp);
			}
			
		}
		System.out.println(arrList.toString());	
	}
			sc.close();}
}
