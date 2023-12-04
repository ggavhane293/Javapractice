package Stringmethods;

public class SplictString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="shdnffb33636!@#$";
		
		StringBuffer alpha = new StringBuffer(), num=new StringBuffer(), special=new StringBuffer();
		
		for(int i=0;i<str.length();i++)
			
		{
			if(Character.isDigit(str.charAt(i)))
					
			{
				num.append(str.charAt(i));
			}
			else if(Character.isAlphabetic(str.charAt(i)))
			{
				alpha.append(str.charAt(i));
			}
			else
			{
				special.append(str.charAt(i));
			}
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(special);
	}
}


