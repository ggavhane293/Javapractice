package LogicalPrograms;

public class CoutnTheNumberOFString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="welcome to java class";
		
		int count=1;
		
		for(int i=1;i<s.length();i++)
		{
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
			System.out.println(count);
	}

}
