package aasignmen2;


import java.lang.*; 
import java.io.*; 
import java.util.*; 
public class a7reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String s1, s2 = "";
	      Scanner sc = new Scanner(System.in);
	     
	      System.out.println("Enter a string to reverse");
	     s1 =sc.nextLine();
	     
	      int length = s1.length();
	     
	      for (int i = length - 1 ; i >= 0 ; i--)
	         s2 = s2 + s2.charAt(i);
	         
	      System.out.println("Reverse of the string: " +s2);
	   }

	}


