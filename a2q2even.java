package assignment2;

import java.util.Scanner;

public class a2q2even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("enter no.");
         Scanner sc=new Scanner (System.in);
        int  n=sc.nextInt();
        System.out.print("even numbers upto  "+n +" are: ");
        for (int i=1;i<=n;i++){
        	if(i%2==0){
        		System.out.print(i);
        		if(i<n && i+1<n){
        			System.out.print(",");
        		}
        		
        	}
        	
        }
         
	}

}
