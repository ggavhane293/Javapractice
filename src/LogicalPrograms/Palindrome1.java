package LogicalPrograms;

public class Palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=151;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		if(num==rev)
		{
			System.out.println("number is plaindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}

	}

}
