package Programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethods {

	public ArrayListMethods() {
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList arraylist=new ArrayList<String>();
		//Adding elements to array list
		arraylist.add("Hi");
		arraylist.add("Welcome");
		arraylist.add("to");
		arraylist.add("ArrayList");
		
		//Printing array list way 1
		System.out.println("The Array List is"+arraylist);
		
		//Printing using iterator
		printArrayList(arraylist);
		System.out.println("Contains "+arraylist.contains("H0"));
		System.out.println("Remove: "+arraylist.remove(1));
		System.out.println("Remove: "+arraylist.remove("to"));
		printArrayList(arraylist);
		
		
		ArrayList<Integer> arIntList =new ArrayList<Integer>();
		arIntList.add(1);
		arIntList.add(2);
		arIntList.add(4);
		arIntList.add(4);
		printArrayList(arIntList);
		
		//addall() method
		arraylist.addAll(1,arIntList);
		printArrayList(arraylist);
		
		//index0f()
		System.out.println("Indexof(): "+arraylist.indexOf(4));	
		arIntList.add(6);
		printArrayList(arIntList);
		arraylist.addAll(arIntList);
		
		//lastindexOf()
		System.out.println("lastIndexof(): "+arraylist.lastIndexOf(4));
		printArrayList(arraylist);
		
		//ArrayList clone()
		ArrayList arnewlist= (ArrayList) arraylist.clone();
		System.out.println("Cloned ArrayList");
		printArrayList(arnewlist);
	
		
		System.out.println("Contains All: "+arraylist.containsAll(arIntList));
		arIntList.remove((Integer)6);
		arraylist.removeAll(arIntList);
		printArrayList(arraylist);
		printArrayList(arraylist);
		Object arr[]=arraylist.toArray();
		System.out.println(arr);
		Integer arri[]= new Integer[arIntList.size()];
				
		arIntList.toArray(arri);
		  for (Integer number : arri) {
		         System.out.print(number+" ");
	}
		  System.out.println();
		  System.out.println(arIntList.hashCode());
		  System.out.println("Cloned arraylist after updation");
		  printArrayList(arnewlist);
	}
	public static void printArrayList(ArrayList arrL)
	{
		//printing arraylist using iterator()
		@SuppressWarnings("rawtypes")
		Iterator it=arrL.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
	}
}
