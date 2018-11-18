package aasignmen2;

import java.util.Scanner;

public class a7noofwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s;
	       Scanner sc = new Scanner(System.in);
	       
	       System.out.print("Enter a String : ");
	       s =sc.nextLine();
		 
		int count = 1;
 
		for (int i = 0; i < s.length() - 1; i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
 
			}
		}
 		System.out.println("Number of words in a string = " + count);
	
	}

}
