package aasignmen2;

import java.util.Scanner;

public class a7vovels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s;
	       Scanner sc = new Scanner(System.in);
	       
	       System.out.print("Enter a String : ");
	       s =sc.nextLine();
	       s = s.replaceAll("[aeiouAEIOU]", "");
	       System.out.print(s);
	}

}
