package Test;

import java.util.Scanner;

public class CountNumOfVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the string");
		
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		char ch[]=str.toCharArray();
		
		int count=0;
		
		for(char c:ch)
		{
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			count++;
			break;
				
			}
		}
		System.out.println(count);
	}

}
