package stringPrograms;

public class ReverseString {
	
	public void reverse(String s)
	{
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			rev=c+rev;
		}
		System.out.println(rev);
	
	}
	public void checkUppercaseLetter(String s)
	{
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
				count++;
			
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rs =new ReverseString();
		rs.reverse("acBBchCd");
		rs.checkUppercaseLetter("VGDFfdfdG");

	}

}
