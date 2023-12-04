package LogicalPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num= 1287834;
		int revno =0;
		
		//while(num>0)
	    for(int i=0;i<=num;i++)
		{
			revno=(revno*10)+(num%10);
			num/=10;
			
		}
		System.out.println(revno);
	}

}
