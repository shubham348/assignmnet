package assignments;
import java.util.Scanner;
public class leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int year;
		System.out.println("enter year");
		Scanner sc =new Scanner(System.in);
		year=sc.nextInt();
		 if(year%100==0){
			     if(year%400==0){
				    System.out.println("leap year");
			      }
		   System.out.println(" not a leap year");
		}
		 else if(year%4==0){
			System.out.println("leap year");
			
		}
		
		else
		{
			System.out.println(" not a leap year");
		}
		
		
		
	}

}
