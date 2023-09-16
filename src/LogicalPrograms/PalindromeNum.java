package LogicalPrograms;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num=1534;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num /10;
		}
		System.out.println(rev);
		if( num ==rev)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
	}

}
