package Programs;

import java.util.Scanner;

public class MatrixMultiplication {

	public MatrixMultiplication() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and cols in First Matrix");
		int rowsOfFirstMatrix=sc.nextInt();
		int colsOfFirstMatrix=sc.nextInt();
		System.out.println("Enter the number of rows and cols in Second Matrix");
		int rowsOfSecondMatrix=sc.nextInt();
		int colsOfSecondMatrix=sc.nextInt();
		if(colsOfFirstMatrix==rowsOfSecondMatrix)
		{
			int[][] matrix1=new int[rowsOfFirstMatrix][colsOfFirstMatrix];
			int[][] matrix2=new int[rowsOfSecondMatrix][colsOfSecondMatrix];
			int[][] multiMatrix=new int[rowsOfFirstMatrix][colsOfSecondMatrix];
			matrix1=get2DArray(matrix1,rowsOfFirstMatrix,colsOfFirstMatrix);
			matrix2=get2DArray(matrix2, colsOfSecondMatrix, rowsOfSecondMatrix);
			System.out.println("Matrix 1 is");
			print2DArray(matrix1);
			System.out.println("Matrix 2 is");
			print2DArray(matrix2);
			for(int i=0;i<rowsOfFirstMatrix;i++)
			{
				for(int j=0;j<colsOfSecondMatrix;j++)
				{
					for(int k=0;k<rowsOfFirstMatrix;k++)
					{
						multiMatrix[i][j]+=matrix1[i][k]*matrix2[k][j]; 
					}
				}
			}
			
			System.out.println("The Matrix multiplication result is");
			print2DArray(multiMatrix);
			
		}
		else
		{
			System.out.println("The columns of the first matrix and the rows of the second matrix should be equal");
		}
		
		
		
	}
	public static int[][] get2DArray(int[][] array,int col,int rows)
	{
		System.out.println("Enter "+(col*rows)+ "number of elements");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		return array;
		
	}
	public static void print2DArray(int[][] array)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
			{
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
