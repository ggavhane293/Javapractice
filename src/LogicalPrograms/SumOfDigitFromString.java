package LogicalPrograms;

public class SumOfDigitFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc12345";
		String abc=str.replaceAll("[^0-9]", "");
		//String abc =str.replaceAll("abc", "");
		
		System.out.println("only numbers are: "+abc);
		char a[]=abc.toCharArray();
				
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			
			sum = sum + a[i]%10;
			
			
		}
		System.out.println("sum of the number is: "+sum);
		
	}

	}


