package javaChallangesQ;

import java.util.Scanner;

public class EvenAdnOddCheck {
	
	//check the odd and even number and as per the condition print the msg

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("please enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num%2!=0)
		{
			System.out.println("is odd");
			
		}
		if(num%2==0)
		{
			if(num>0 && num<10)
				System.out.println("is beetwin 10");
			  
			if(num>10 && num<20)
				System.out.println("is beetwin 20");
			if(num>20)

				System.out.println("is above 20");	
			
		}
		
	}

}
