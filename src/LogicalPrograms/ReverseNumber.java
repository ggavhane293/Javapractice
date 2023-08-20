package LogicalPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num= 1234;
		int revno =0;
		
		while(num>0)
		{
			revno=(revno*10)+(num%10);
			num/=10;
			
		}
		System.out.println(revno);
	}

}
