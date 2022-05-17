package Programs;

import java.util.ArrayList;
import java.util.Scanner;

public class selectionSortAlgorithm {

	public selectionSortAlgorithm() {
		// TODO Auto-generated constructor stub
	}
	static ArrayList<Integer> arList=new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++) {
			arList.add(sc.nextInt());
		}
		selectionSort(size);
	}
	public static void selectionSort(int size)
	{
		int minIndex=0;
		int minnum;
		for(int i=0;i<size;i++)
		{
			minIndex=i;
			minnum=0;
			for(int j=i+1;j<size;j++)
			{	

				if(arList.get(j)<arList.get(i))
				{
					if(minnum==0)
					{
						minIndex=j;
						minnum=arList.get(j);
					}

					else if(minnum>arList.get(j))
					{
						minnum=arList.get(j);
						minIndex=j;
					}
				}
			}
			if(minIndex!=i)
			{
				int temp=arList.get(i);
				arList.set(i, arList.get(minIndex));
				arList.set(minIndex, temp);

			}
			System.out.println(arList.toString());

		}
	}
}
