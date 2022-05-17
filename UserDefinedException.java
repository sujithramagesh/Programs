package Programs;

public class UserDefinedException {

	public UserDefinedException() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		try
		{
			int arr[]=new int[7];
			for(int i=0;i<=arr.length;i++)
			{
				System.out.println(arr[i]);
			}
			throw new MyException("You are accessing beyond array limit");
		}
		catch (MyException e) {
			System.out.println("Exception Caught");
			System.out.println(e.getMessage());
		}
	}
}
class MyException extends Exception
{
	public MyException(String str)
	{
		System.out.println(str);
	}
}
