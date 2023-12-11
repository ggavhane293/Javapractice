package javaChallangesQ;

public class DsipalyMultipleOfNum {

	//display the multiple of 3 or 5 between 0 to 50  but not common multiple.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=50;i++)
		{
			if(i%3==0 && i%5==0)
			{
				continue ;
			}
			if(i%3==0)
			{
				System.out.println(i);
			}
			if(i%5==0)
			{
				System.out.println(i);
			}
			
		}

	}

}
