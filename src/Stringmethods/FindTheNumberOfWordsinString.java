package Stringmethods;

public class FindTheNumberOfWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="test stere fd dfd sf ";
		String w="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			{
				w=w+c;
			}
			else
			{
				if(w.endsWith("d"))// to find the character ending with D
				count++;
			}
		}
		System.out.println(count);
	}

}
