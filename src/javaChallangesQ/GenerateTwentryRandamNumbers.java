package javaChallangesQ;

import java.util.Random;

public class GenerateTwentryRandamNumbers {
	//generate the 20 random number between 100 to 200 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rm = new Random();
		
		
		for(int i=0;i<=200;i++)
		{
			int count=0;
			int x = rm.nextInt(200);
			if(x>100 && x<200)
			{
				System.out.println(x);
			count++;
			}
			if(count==20)
			{
				break;
				
     		}
			
			
			
		}

	}

}
