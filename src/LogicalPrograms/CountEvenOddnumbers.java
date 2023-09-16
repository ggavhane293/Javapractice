package LogicalPrograms;

public class CountEvenOddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =12345;
		int even=0;
		int odd=0;
		
		while(num>0)
		{
			int reminder=num%10;// it will give us the last digit reminder number
			if(num%2==0) //checking the condition of reminder number
			{
				even++;//if number is even increase the count
			}
			else
			{
				odd++;//if number is odd increase the count
			}
			
			num=num/10;//Eliminating the last digit after checking in above 
		}
		  System.out.println("even count is "+even);
		  System.out.println("odd count is "+odd);

	}

}
