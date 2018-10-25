package assignment2;

import java.util.Scanner;

public class complex {
int real,imaginary;
void Display() {
	System.out.println(real+"+"+imaginary+"i");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		complex r=new complex();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter real no");
		 r.real=sc.nextInt();
		 System.out.println("enter imaginary no");
		 r.imaginary=sc.nextInt();
		 r.Display();
	
		 
	}

}
