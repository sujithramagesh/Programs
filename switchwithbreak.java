package Programs;
import java.util.Scanner;

public class switchwithbreak {

	public switchwithbreak() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		boolean isvowel=false;
		switch(ch)
		{
		case 'a' :
			isvowel=true;
			break;
		case 'e' :
			isvowel=true;
			break;
		case 'i' :
			isvowel=true;
			break;
		case 'o' :
			isvowel=true;
			break;
		case 'u' :
			isvowel=true;
			break;
		case 'A' :
			isvowel=true;
			break;
		case 'E' :
			isvowel=true;
			break;
		case 'I' :
			isvowel=true;
			break;
		case 'O' :
			isvowel=true;
			break;
		case 'U' : 
			isvowel=true;
			break;
		default:
			System.out.println("Inside default");
		}
		if(isvowel==true)
		{
			System.out.println("The given character '"+ch+"' is a vowel");
		}
		else if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
		{
			System.out.println("The given character '"+ch+"' is a consonant");
		}
		else
		{
			System.out.println("The given input is not an Alphabet");
		}
	}
}
