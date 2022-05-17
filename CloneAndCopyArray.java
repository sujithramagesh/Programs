package Programs;

import java.util.Arrays;

public class CloneAndCopyArray {

	public CloneAndCopyArray() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int array[]= {1,2,3,4,5};
		
		int array1[]=new int[array.length];
		for (int i = 0; i < array.length; i++)
			array1[i] = array[i];
		
		int array2[];
		array2=array;
		
		System.out.println("The original Array");
		NumberWeights.arrayPrint(array);
		
		System.out.println("The Array copied through iteration is");
		NumberWeights.arrayPrint(array1);
		
		System.out.println("The Array2");
		NumberWeights.arrayPrint(array2);
		
		int cloneArray[]=array.clone();
		System.out.println("The Cloned Array");
		NumberWeights.arrayPrint(cloneArray);
		
		//public static void arraycopy(Object src,int srcPos,Object dest,int destpos,int length)
		int[] arrayCopy = new int[array.length];
		System.arraycopy(array, 0,arrayCopy, 0, array.length);
		System.out.println("The Copied Array using arrayCopy()");
		NumberWeights.arrayPrint(arrayCopy);
		
		//public static int[] copyof(int[] original,int newLength) 
		int copyOfArray[]=Arrays.copyOf(array, array.length);
		System.out.println("The Copied Array using Copyof()");
		NumberWeights.arrayPrint(copyOfArray);
		
		//public static int[] copyOfRange(int[] original,int from,int to)
		int copyOfRangeArray[]=Arrays.copyOfRange(array, 2, array.length);
		System.out.println("The Copied Array using CopyofRange()");
		NumberWeights.arrayPrint(copyOfRangeArray);
		
		array[2]=8;
		System.out.println("The Array after updation");
		NumberWeights.arrayPrint(array);
		System.out.println("The Array copied through iteration is");
		NumberWeights.arrayPrint(array1);
		System.out.println("The Array2");
		NumberWeights.arrayPrint(array2);
		System.out.println("The Cloned Array");
		NumberWeights.arrayPrint(cloneArray);
		System.out.println("The Copied Array using arrayCopy()");
		NumberWeights.arrayPrint(arrayCopy);
		System.out.println("The Copied Array using Copyof()");
		NumberWeights.arrayPrint(copyOfArray);
		System.out.println("The Copied Array using CopyofRange()");
		NumberWeights.arrayPrint(copyOfRangeArray);
	}
}
