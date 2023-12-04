package LogicalPrograms;

import java.util.Scanner;

public class Q3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int choice = 0;

		if(s.hasNextInt()) 
		{
		   choice = s.nextInt();
		}

		s.close();
		
		Scanner ab = new Scanner(System.in);
		int x= ab.nextInt();
		ab.close();
		
		if(x%2==0)
		System.out.println(s);
		if(x%2==0)
		if(x<=0&&x>=10)	
			System.out.println("Hi");
		
			if(x<=11&&x>=20)
						System.out.println("hello in");
			
			if(x<20)
			
				System.out.println("bye");
			
		
	}

}
