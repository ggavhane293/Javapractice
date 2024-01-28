package Stringmethods;

public class FindTheLongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="test gd gdgd gdgddss ";
		String lw="";
		String w="";
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c!=' ')
			{
				w=w+c;
			}
			else
			{
				if(w.length()>lw.length())
					lw=w;
				w="";
			}
		}
		System.out.println(lw);
	}

}

