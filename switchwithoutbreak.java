package Programs;

import java.util.Scanner;

public class switchwithoutbreak {

	public switchwithoutbreak() {
		// TODO Auto-generated constructor stub
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			char ch=sc.next().charAt(0);
			boolean isvowel=false;
			switch(ch)
			{
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
			case 'A' :
			case 'E' :
			case 'I' :
			case 'O' :
			case 'U' : isvowel=true;
			default:
				System.out.println("Inside default");
				break;
			}
			if(isvowel==true)
			{
				System.out.println("The given character '"+ch+"' is a vowel");
			}
			else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			{
				System.out.println("The given character '"+ch+"' is a consonant");
			}
			else
			{
				System.out.println("The given input is not an Alphabet");
			}
		}
	}


