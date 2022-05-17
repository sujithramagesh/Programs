package Programs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArrayOddAndEven {

	public RearrangeArrayOddAndEven() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the arrays");
		int arraySize=sc.nextInt();
		int array[]=new int[arraySize];
		System.out.println("Enter the array elements");
		for(int i=0;i<arraySize;i++)
		{
			array[i]=sc.nextInt();
		}
		int oddSize,evenSize;
		if(arraySize%2==0)
		{
			oddSize=arraySize/2;
			evenSize=arraySize/2;
		}
		else
		{
			oddSize=(arraySize/2)+1;
			evenSize=arraySize/2;
		}
		
		Arrays.sort(array);
		int[] sortArray=new int[arraySize];
		int evenPositionInitialIndex=1;
		for(int i=arraySize-evenSize;i<arraySize;i++)
		{
			sortArray[evenPositionInitialIndex]=array[i];
			evenPositionInitialIndex+=2;
		}
		int oddPositionInitialIndex=0;
		System.out.println("The array is");
		NumberWeights.arrayPrint(array);
		for(int i=oddSize-1;i>=0;i--)
		{
			sortArray[oddPositionInitialIndex]=array[i];
			oddPositionInitialIndex+=2;
			
		}
		System.out.println("The array after sorting is");
		NumberWeights.arrayPrint(sortArray);
	}
}
