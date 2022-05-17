package Programs;

import java.util.ArrayList;
import java.util.Scanner;

public class quickSort {
	static ArrayList<Integer> initialArray =new ArrayList<Integer>();
	public quickSort() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size=sc.nextInt();
	
	for(int i=0;i<size;i++)
	{
		initialArray.add(sc.nextInt());
	}
	quickSortfunction(0, size);
	
			
}
	public static int partitionpivotArray(ArrayList<Integer> initialArray, int initial,int size)
	{
		int pivotNum=initialArray.get(initial);
		for(int i=0;i<initialArray.size();i++)
		{
			for(int j=initialArray.size() ;j>0;j--)
			{
				while(i<j)
				{
					do {
						i++;
					}while(initialArray.get(i)<pivotNum);
					do
					{
						j--;
					}while(initialArray.get(j)>pivotNum);
					if(i>j)
					{
						swap(0,j,initialArray);
						return j;
					}
					swap(i,j,initialArray);
					System.out.println(initialArray.toString());
					

				}
			}
		}
		return -1;
	}
	public static void quickSortfunction(int lindex,int size)
	{
		 lindex=0;
		if(lindex<size)
		{
			int j=partitionpivotArray(initialArray,lindex,size);
			 quickSortfunction(lindex, j);
			 if(j+1<size)
			 quickSortfunction(j+1, size);
		}
		System.out.println(initialArray.toString());
	}
	public static void swap(int a,int b,ArrayList<Integer> arr)
	{
		int temp=arr.get(a);
		arr.set(a, arr.get(b));
		arr.set(b, temp);
	}
}
