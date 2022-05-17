package Programs;

public class Student_details {

	public Student_details() {
		// TODO Auto-generated constructor stub
	}
 private String Name;
 private int age;
 private String email;
 private char gender;
 private long mobile_number;
 public String getName()
{
	return Name;
}
 public int getAge()
 {
	 return age;
 }
 public String getEmail()
 {
	 return email;
 }
 public char getGender()
 {
	 return gender;
 }
 public long getMobilenumber()
 {
	 return mobile_number;
 }
 public void setName(String Name)
 {
	 this.Name=Name;
 }
 public void setAge(int age)
 {
	 this.age=age;
 }
 public void setEmail(String email)
 {
	 this.email=email;
 }
 public void setGender(char gender)
 {
	 this.gender=gender;
 }
 public void setMobilenumber(long mobile_number)
 {
	this.mobile_number=mobile_number; 
 }
@Override
public String toString() {
	return "Student_details [Name=" + Name + ", age=" + age + ", email=" + email + ", gender=" + gender
			+ ", mobile_number=" + mobile_number + "]";
}
 
}
