package aasignmen2;

import java.util.Scanner;

public class a7substringpresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1, s2 = "";
	      Scanner sc = new Scanner(System.in);
	     
	      System.out.println("Enter a string ");
	     s1 = sc.nextLine();

	      System.out.println("Enter a substring ");
	      s1 = sc.nextLine();
		boolean b = s1.contains(s2);
		if(b==true){
			System.out.println("substring is present");
		}
		else{
			System.out.println("substring not present");
		}
		
	}

}
