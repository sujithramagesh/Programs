package Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class NumberWeights {

	public NumberWeights() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");;
		int arraySize=sc.nextInt();
		int[] array=new int[arraySize];
		System.out.println("Enter the array elements");
		for(int i=0;i<arraySize;i++)
		{
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);
		int numberWeight;
		int weightArray[]=new int[arraySize];
		for(int i=0;i<arraySize;i++)
		{
			numberWeight=0;
			int squareVal=(int)Math.floor(Math.sqrt(array[i]));
			if((squareVal*squareVal)==array[i])
			{
				numberWeight+=5;
			}
			if((array[i]%4==0)&&(array[i]%6==0))
			{
				numberWeight+=4;
			}
			if(array[i]%2==0)
			{
				numberWeight+=3;
			}
			weightArray[i]=numberWeight;
		}
		/*
		 * System.out.println("The initial array is"); arrayPrint(array);
		 * System.out.println("The weight array is"); arrayPrint(weightArray);
		 */
		for(int i=0;i<arraySize;i++)
		{
			for(int j=i+1;j<arraySize;j++)
			{
				if(weightArray[i]<weightArray[j])
				{
					int tempVarForWeightArray=weightArray[i];
					weightArray[i]=weightArray[j];
					weightArray[j]=tempVarForWeightArray;
					int tempVarForInitialArray=array[i];
					array[i]=array[j];
					array[j]=tempVarForInitialArray;
				}
				
			}
		}
		/*
		 * System.out.println("The initial array after sorting"); arrayPrint(array);
		 * System.out.println("The weight array after sorting"); array
		 Print(weightArray);*/
		System.out.println("The array value and weight is");
		for(int i=0;i<arraySize;i++)
		{
			System.out.print("< "+(int)array[i]+","+weightArray[i]+" >");
		}
		
	}
	public static void arrayPrint(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
