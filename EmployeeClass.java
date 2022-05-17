package Programs;

public class EmployeeClass {

	public EmployeeClass() {
		// TODO Auto-generated constructor stub
	}
	int employeeId;
	String employeeName;
	int employeeAge;
	long employeePhoneNumber;
	public EmployeeClass(int employeeId,String employeeName,int employeeAge,long employeePhoneNumber)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeAge=employeeAge;
		this.employeePhoneNumber=employeePhoneNumber;		
	}
	@Override
	public String toString() {
		return "Employee Id=" + employeeId + ", \nEmployeeName=" + employeeName + ", \nemployeeAge="
				+ employeeAge + ", \nemployeePhoneNumber=" + employeePhoneNumber + "]";
	}

}
