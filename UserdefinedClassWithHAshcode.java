package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UserdefinedClassWithHAshcode {
	String Name;
	int age;
	long phonenumber;
	

	@Override
	public int hashCode() {
		return Objects.hash(Name, age, phonenumber);
		//return 0;
	}


	@Override
	public String toString() {
		return "UserdefinedClassWithHAshcode [Name=" + Name + ", age=" + age + ", phonenumber=" + phonenumber + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserdefinedClassWithHAshcode other = (UserdefinedClassWithHAshcode) obj;
		return Objects.equals(Name, other.Name) && age == other.age && phonenumber == other.phonenumber;
	}


	public UserdefinedClassWithHAshcode(String name,int age,long phoneNumber) {
		// TODO Auto-generated constructor stub
		this.Name=name;
		this.age=age;
		this.phonenumber=phoneNumber;
	}
public String getName() {
	return Name;
}


public void setName(String name) {
	Name = name;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public long getPhonenumber() {
	return phonenumber;
}


public void setPhonenumber(long phonenumber) {
	this.phonenumber = phonenumber;
}
public static void main(String[] args) {
	HashMap<UserdefinedClassWithHAshcode,String> hm=new HashMap<>();
	getHashMap(hm);
	printHashMap(hm);
}
public static void printHashMap(HashMap<UserdefinedClassWithHAshcode,String> hm)
{
	for(Map.Entry<UserdefinedClassWithHAshcode, String> entr:hm.entrySet())
	{
		System.out.println(entr.getKey().toString()+"   "+entr.getValue());
	}
}
public static void getHashMap(HashMap<UserdefinedClassWithHAshcode,String> hm)
{
	
	System.out.println(hm.size());
	UserdefinedClassWithHAshcode us=new UserdefinedClassWithHAshcode("Suji", 29, 9876543219l);
	UserdefinedClassWithHAshcode us1=new UserdefinedClassWithHAshcode("Raji", 29, 9876543219l);
	UserdefinedClassWithHAshcode us2=new UserdefinedClassWithHAshcode("Sanjay", 29, 9876543219l);
	UserdefinedClassWithHAshcode us3=new UserdefinedClassWithHAshcode("Saurabh", 29, 9876543219l);
	UserdefinedClassWithHAshcode us4=new UserdefinedClassWithHAshcode("Rekha", 29, 9876543219l);
	UserdefinedClassWithHAshcode us5=new UserdefinedClassWithHAshcode("Nidarsana", 29, 9876543219l);
	UserdefinedClassWithHAshcode us6=new UserdefinedClassWithHAshcode("ll", 29, 9876543219l);
	UserdefinedClassWithHAshcode us7=new UserdefinedClassWithHAshcode("Magesh", 29, 9876543219l);
	UserdefinedClassWithHAshcode us8=new UserdefinedClassWithHAshcode("Tony", 29, 9876543219l);
	UserdefinedClassWithHAshcode us9=new UserdefinedClassWithHAshcode("Jadzia", 29, 9876543219l);
	UserdefinedClassWithHAshcode us10=new UserdefinedClassWithHAshcode("Beula", 29, 9876543219l);
	UserdefinedClassWithHAshcode us11=new UserdefinedClassWithHAshcode("Banu", 29, 9876543219l);
	UserdefinedClassWithHAshcode us12=new UserdefinedClassWithHAshcode("Reela", 29, 9876543219l);
	UserdefinedClassWithHAshcode us13=new UserdefinedClassWithHAshcode("Suji1", 29, 9876543219l);
	UserdefinedClassWithHAshcode us14=new UserdefinedClassWithHAshcode("Raji1", 29, 9876543219l);
	UserdefinedClassWithHAshcode us15=new UserdefinedClassWithHAshcode("Sanjay1", 29, 9876543219l);
	UserdefinedClassWithHAshcode us16=new UserdefinedClassWithHAshcode("Saurabh1", 29, 9876543219l);
	UserdefinedClassWithHAshcode us17=new UserdefinedClassWithHAshcode("Rekha1", 29, 9876543219l);
	UserdefinedClassWithHAshcode us18=new UserdefinedClassWithHAshcode("Nidarsana1", 29, 9876543219l);
	UserdefinedClassWithHAshcode us19=new UserdefinedClassWithHAshcode("ll1", 29, 9876543219l);
	UserdefinedClassWithHAshcode us20=new UserdefinedClassWithHAshcode("Magesh1", 29, 9876543219l);
	UserdefinedClassWithHAshcode us21=new UserdefinedClassWithHAshcode("Tony1", 29, 9876543219l);
	UserdefinedClassWithHAshcode us22=new UserdefinedClassWithHAshcode("Jadzia1", 29, 9876543219l);
	UserdefinedClassWithHAshcode us23=new UserdefinedClassWithHAshcode("Beula1", 29, 9876543219l);
	UserdefinedClassWithHAshcode us24=new UserdefinedClassWithHAshcode("Banu1", 29, 9876543219l);
	UserdefinedClassWithHAshcode us25=new UserdefinedClassWithHAshcode("Reela1", 29, 9876543219l);
	//System.out.println(hm.hashCode());
	hm.put(us, us.getName());
	//System.out.println(hm.hashCode());
	hm.put(us1, us1.getName());
	//System.out.println(hm.hashCode());
	hm.put(us2, us2.getName());
	hm.put(us3, us3.getName());
	hm.put(us4, us4.getName());
	hm.put(us5, us5.getName());
	hm.put(us6, us6.getName());
	System.out.println(hm.size());
	//System.out.println(hm.hashCode());
	hm.put(us7, us7.getName());
	hm.put(us8, us8.getName());
	hm.put(us9, us9.getName());
	hm.put(us10, us10.getName());
	hm.put(us11, us11.getName());
	hm.put(us12, us12.getName());
	System.out.println(hm.size());
	//System.out.println(hm.hashCode());
	hm.put(us13, us13.getName());
	hm.put(us14, us14.getName());
	hm.put(us15, us15.getName());
	hm.put(us16, us16.getName());
	hm.put(us17, us17.getName());
	hm.put(us18, us18.getName());
	hm.put(us19, us19.getName());
	System.out.println(hm.size());
	//System.out.println(hm.hashCode());
	hm.put(us20, us20.getName());
	hm.put(us21, us21.getName());
	hm.put(us22, us22.getName());
	hm.put(us23, us23.getName());
	hm.put(us24, us24.getName());
	hm.put(us25, us25.getName());
	System.out.println(hm.size());
	//System.out.println(hm.hashCode());
}
}
