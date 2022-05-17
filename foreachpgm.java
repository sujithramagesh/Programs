package Programs;

import java.math.BigInteger;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class foreachpgm {

	private static final boolean String = false;
	public foreachpgm() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee name");
		String emp_name=sc.next();
		System.out.println("Enter the age");
		int age=sc.nextInt();
		System.out.println("Enter the phonenumber");
		BigInteger phnumber=sc.nextBigInteger();
		/*
		 * HashMap<String, String> hm=new HashMap<String, String>(); hm.put("Name",
		 * emp_name); hm.put("age", age); hm.put("Phone number", phnumber); for(Entry
		 * map:hm.entrySet()) { System.out.print(str+" "); } Syste
		 m.out.println();*/
		List<Object> emplist=new ArrayList<Object>();
		emplist.add(emp_name);
		emplist.add(age);
		emplist.add(phnumber);
		for(Object str:emplist)
		{
			System.out.print(str+" ");
		}
		System.out.println();
	}
}
