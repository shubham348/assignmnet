package assignment2;

import java.util.Scanner;

public class rectangle {
 int length,breadth;
 
 void CalculateArea() {
	 int area=length*breadth;
	 System.out.println("area="+area);
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 rectangle r=new rectangle();
 Scanner sc=new Scanner(System.in);
 System.out.println("enter length");
 r.length=sc.nextInt();
 System.out.println("enter breadth");
 r.breadth=sc.nextInt();
 r.CalculateArea();
 
	}

}
