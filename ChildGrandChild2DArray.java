package Programs;

import java.util.Scanner;

import Programs.ChildGrandChild.Family;

public class ChildGrandChild2DArray {
	static String[] nameArray;
	public ChildGrandChild2DArray() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of names you are going to give"); 
		int  noOfNames=sc.nextInt(); 
		sc.nextLine(); 
		nameArray=new String[noOfNames]; 
		System.out.println("Enter the names");
		for(int i=0;i<noOfNames;i++) {

			nameArray[i]=sc.nextLine(); 
			
		} 
			arrayPrint(nameArray);
			System.out.println("Enter the name to find their number of grand children");
			String fName=sc.next(); 
			System.out.println(findNoOfChildren(fName, 0));
			
	}
	public static int findNoOfChildren(String fName,int count)
	{
		//String cName;
		
		for(String f:nameArray)
		{
			String[] scNAme=f.split(" ");
			if(scNAme[1].equals(fName))
			{
				count=findNoOfGrandChildren(scNAme[0],count);
			}
		}
		
		return count;
		
	}
	public static int findNoOfGrandChildren(String cName, int count)
	{
		for(String f:nameArray)
		{
			String[] scNAme=f.split(" ");
			if(scNAme[1].equals(cName))
			{

					count++;
				
			}
		}
		return count;
	}
	public static void arrayPrint(String[] arr)
	{ for(int i=0;i<arr.length;i++)
		  { 
		System.out.println(arr[i]+" "); 
		} //System.out.println(); }
		  }

}
