package assignment2;

import java.util.Scanner;

public class a2q7array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,4,6,7,8,9,10};
		int l=a.length;
		int n,k=0;
		System.out.println("enter no:");
		Scanner sc=new Scanner (System.in);
		n=sc.nextInt();
		for(int i=0;i<l;i++){
			if(n==a[i]){
				k=0;
				System.out.print(n+" does exist in the array");
				break;
			}
			k++;
			
		}
		if(k>0){
			System.out.print(n+" does not exist in the array");
		}
		
		
		
	}

}
