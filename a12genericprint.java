package aasignmen2;

import java.util.Scanner;

public class a12genericprint {



	
	 

	  public static void main(String args[]) {
	    // create arrays of Integer, Double and Character
	    Integer[] intarr = new Integer[20];
	    Double[] doublearr =new Double[20];
	    Character[] chararr = new Character[20];
	    Scanner sc=new Scanner(System.in);
	    int ch = 0;
	    System.out.println("enter 1 for integer array ");
	    System.out.println("enter 2 for double array ");
	    System.out.println("enter 3 for character array ");
	    System.out.println("enter your choice ");
	    ch=sc.nextInt();
	    switch(ch){
	    case 1:
	    {
	    	System.out.println("enter  size of the array ");
	    	int n=sc.nextInt();
	    	System.out.println("enter  elements of the array ");
	    	for(int i=0;i<n;i++){
	    		intarr[i]=sc.nextInt();
	    	}
	    	System.out.println("printing   elements of the array ");
	    	print(intarr,n);
	    	break;
	    }
	    case 2:
	    {
	    	System.out.println("enter  size of the array ");
	    	int n=sc.nextInt();
	    	System.out.println("enter  elements of the array ");
	    	for(int i=0;i<n;i++){
	    		doublearr[i]=sc.nextDouble();
	    	}
	    	System.out.println("printing   elements of the array ");
	    	print(doublearr,n);
	    	
	    	break;
	    }
	    case 3:{
	    	System.out.println("enter  size of the array ");
	    	int n=sc.nextInt();
	    	System.out.println("enter  elements of the array ");
	    	for(int i=0;i<n;i++){
	    		chararr[i]= sc.next().charAt(0);
	    	}
	    	System.out.println("printing   elements of the array ");
	    	print(chararr,n);
	    	break;
	    }
	    default:
	    	System.out.println("wrong value");
	    
	    	 
	    }  

	  }
	  public static <datatype> void print(datatype[] array,int n) {
		    
		    for (int j=0;j<n;j++)
		      System.out.println( array[j]);

		  }
	}