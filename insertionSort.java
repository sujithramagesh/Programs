package Programs;

import java.util.ArrayList;
import java.util.Scanner;

public class insertionSort {
	static ArrayList<Integer> arrlist=new ArrayList<Integer>();
	public insertionSort() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();

		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			arrlist.add(sc.nextInt());
		}
		for(int i=0;i<size;i++)
		{
			//for(int j=0;j<size;j++) {
			if(i==size-1)
			{
				reversesearch(i);
			}
			else
			{
				if((i+1)<size-1 && arrlist.get(i)>arrlist.get(i+1))
				{
					int temp=arrlist.get(i);
					arrlist.set(i,arrlist.get(i+1));
					arrlist.set(i+1, temp);
					if(i>0)
					{
						reversesearch(i);					
					}
				}
			}

			System.out.println(arrlist.toString());
		}
	}
	public static void reversesearch(int i)
	{
		for(int j=i;j>0;j--)
		{
			if(arrlist.get(j)<arrlist.get(j-1))
			{
				int temp=arrlist.get(j);
				arrlist.set(j,arrlist.get(j-1));
				arrlist.set(j-1, temp);
			}
			else
			{
				break;
			}
			System.out.println(arrlist.toString());
		}

	}

}
