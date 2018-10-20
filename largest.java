package assignments;
import java.util.Scanner;
public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("enter values of a,b and c");
	     Scanner sc=new Scanner (System.in);
	     int a=sc.nextInt();
	     int b=sc.nextInt();
	     int c= sc.nextInt();
	     if(a>b&&b>c)
	     {
	    	 System.out.println("a="+a+"is largest");
	     }
	     else if(b>c){
	    	 System.out.println("b="+b+"is largest");
	     }
	     else
	     {
	    	 System.out.println("c="+c+"is largest");
	     }
	}

}
