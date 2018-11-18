package aasignmen2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class a11sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 int e,n;	
		 Set<Integer> s1= new HashSet<Integer>();
		 Set<Integer> s2= new HashSet<Integer>();
		Set<Integer> s3= new HashSet<Integer>();
		
		 System.out.println("Enter size of set 1");
			n=sc.nextInt();
			System.out.println("Enter  elements for set 1");
			for(int j=1;j<=n;j++) {
				e=sc.nextInt();
			s1.add(e);}
			
		 System.out.println("Enter sizez of  set2: ");
				n=sc.nextInt();
				
	System.out.println("Enter elements for  set 2 ");
	for(int j=1;j<=n;j++) {
		e=sc.nextInt();
	s2.add(e);
	}
	
	   s3.addAll(s1);

	   s3.retainAll(s2);
	   System.out.println("The elements which are same on both sets are: ");
		   System.out.println(s3);
		     }
	}

	


