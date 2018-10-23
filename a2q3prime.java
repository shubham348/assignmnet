package assignment2;

import java.util.Scanner;

public class a2q3prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,c=0;
		int k=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter no.");
		num=sc.nextInt();
		System.out.print("prime numbers upto  "+num +" are: ");
		for(int j=2;j<=num;j++){
			for(int i = 2;i <= j/2; i++)
	        {
	            if(j % i == 0)
	            {
	                c++;
	            }
	        }

	        if (c==0)
	        {
	        	k++;
	        	if(k==1){
	        		System.out.print(j);
	        	}
	        	else{
	        		System.out.print(","+j);
	        	}
	        	
	        	
	            
	       }
	        c=0;
		}
		
	}
}
		
		
    
	
	

