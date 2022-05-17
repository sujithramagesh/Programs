package Programs;

import java.util.Scanner;

public class ProgramPattern {

	public ProgramPattern() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the String");
	      String inputString=sc.nextLine();
	      int rows=inputString.length(); 
	      for(int i=1;i<=rows;i++)
	      {
	    	  for(int j=1;j<=rows;j++)
	    	  {
	    		  if(i==j)
	    		  {
	    			  System.out.print(inputString.charAt(j-1));
	    		  }
	    		  else if(j==(rows-i+1))
	    		  {
	    			  System.out.print(inputString.charAt(i-1));
	    		  }
	    		  else
	    			  System.out.print(" ");
	    	  }
	    	  System.out.println();
	      } 
	}
}
