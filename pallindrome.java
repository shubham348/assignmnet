package assignments;
import java.util.Scanner;
public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n=0,sum=0,r=0;
         System.out.println("enter no.");
         Scanner sc=new Scanner (System.in);
         n=sc.nextInt();
         int num=n;
         while (n!=0)
         {
        	 r=n%10;
        	 sum=sum*10+r;
        	 n=n/10;
         }
         if(sum==num){
        	 System.out.println("pallindrome");
         }
         else{
        	 System.out.println("not pallindrome");
         }
	}

}
