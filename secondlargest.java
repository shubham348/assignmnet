package assignment2;

import java.util.Scanner;

public class secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[10];
Scanner sc=new Scanner(System.in);
for (int i = 0; i < 10; i++) {
	a[i]=sc.nextInt();
}
int largest=a[0];
int secondlargest=a[0];
		System.out.println("The given array is:" );
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	
		for (int i = 0; i < a.length; i++) {
 
			if (a[i] > largest) {
				secondlargest = largest;
				largest = a[i];
 
			} else if (a[i] > secondlargest) {
				secondlargest = a[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondlargest);

}
}
