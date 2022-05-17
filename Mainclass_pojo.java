package Programs;

import java.util.Scanner;

public class Mainclass_pojo {

	public Mainclass_pojo() {
		// TODO Auto-generated constructor stub
	}
public static void main(String args[])
{
	Student_details sd=new Student_details();
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Name");
	sd.setName(scan.next());
	System.out.println("Enter the Age");
	sd.setAge(scan.nextInt());
	System.out.println("Enter the email address");
	sd.setEmail(scan.next());
	System.out.println("Enter the gender");
	sd.setGender(scan.next().charAt(0));
	System.out.println("Enter the mobile number");
	sd.setMobilenumber(scan.nextLong());
	System.out.println("The name is "+sd.getName());
	System.out.println("The Age is "+sd.getAge());
	System.out.println("The Email is "+sd.getEmail());
	System.out.println("The Gender is "+ sd.getGender());
	System.out.println("The Mobile Number is "+sd.getMobilenumber());
}
}
