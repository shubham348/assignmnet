package aasignmen2;

import java.util.Scanner;

public class a7substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1 = "";
	      Scanner sc = new Scanner(System.in);
	     s1=sc.nextLine();
		 
        int n=s1.length();
		 for (int i = 0; i < n; i++)  {
			 for (int j = i+1; j <= n; j++) {
	        	   System.out.println(s1.substring(i, j)); 
	           }
		 }
	           
	               

	}

}
