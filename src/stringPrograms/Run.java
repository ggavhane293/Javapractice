package stringPrograms;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "my name is ganesh";
		String result ="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(i == 0 || str.charAt(i-1) == ' ')
			{
				result+=Character.toUpperCase(ch);
				
			}
			else
			{
				result+=ch;
			}
			
	}
		System.out.println(result.trim());

}
}