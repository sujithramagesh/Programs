package Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChildGrandChild {

	static List<Family> family = new ArrayList<Family>();

	public static void main(String[] args) {
		/*
		 * String str="luke shaw"; String[] str1=str.split(" ",str.length()); for(String
		 * w:str1) { System.out.println(w); } System.out.println(str);
		 */
		System.out.println("Enter the name as CHILDNAME FATHERNAME \n print END to stop getting input");
		Scanner sc=new Scanner(System.in);
		String str="";
		do
		{
			str=sc.nextLine();
			String[] names = str.split(" ");
			if(names.length>1)
			family.add(new Family(names[0], names[1]));
			
		}while(!(str.equals("END")));
		
		/*
		 * family.add(new Family("luke", "shaw")); family.add(new Family("wayne",
		 * "rooney")); family.add(new Family("rooney", "ronaldo")); family.add(new
		 * Family("Mark", "ronaldo")); //family.add(new Family("Max", "Mark"));
		 * family.add(new Family("shaw", "rooney"));
		 */
		System.out.println(family);
		System.out.println("Enter the name whose grandchildren has to be found");
		String fName=sc.next();
		System.out.println(findNoOfChildren(fName, 0));
	}
	public static int findNoOfChildren(String fName,int count)
	{
		//String cName;
		for(Family f:family)
		{
			if(f.fName.equals(fName))
			{
				count=findNoOfGrandChildren(f.cName,count);
			}
		}
		return count;
		
	}
	public static int findNoOfGrandChildren(String cName, int count)
	{
		for(Family f : family)
		{
			if(f.fName.equals(cName))
			{

					count++;
				
			}
		}
		return count;
	}
	static class Family
	{
		String fName;
		String cName;
		public Family(String cName, String fName)
		{
			this.fName = fName;
			this.cName = cName;
		}
		@Override
		public String toString() {
			return "Family [fName=" + fName + ", cName=" + cName + "]";
		}
		
	}
	/*
	 * public ChildGrandChild() { // TODO Auto-generated constructor stub } public
	 * static void main(String[] args) { Scanner sc=new Scanner(System.in);
	 * System.out.println("Enter the number of names you are going to give"); int
	 * noOfNames=sc.nextInt(); sc.nextLine(); String[] nameArray=new
	 * String[noOfNames]; System.out.println("Enter the names");
	 * 
	 * for(int i=0;i<noOfNames;i++) {
	 * 
	 * nameArray[i]=sc.nextLine(); } System.out.println(nameArray.length);
	 * arrayPrint(nameArray);
	 * System.out.println("Enter the name to find their number of grand children");
	 * String nameOfGrandFather=sc.next(); for(int i=0;i<noOfNames;i++) {
	 * nameOfGrandFather.equals(nameArray[i].split(" ")) }
	 * 
	 * } public static void arrayPrint(String[] arr) { for(int i=0;i<arr.length;i++)
	 * { System.out.println(arr[i]+" "); } //System.out.println(); }
	 */
}
