package assignments;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,c=0;
		Scanner sc=new Scanner (System.in);
		num=sc.nextInt();
		for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                c++;
            }
        }

        if (c==0)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
	}

