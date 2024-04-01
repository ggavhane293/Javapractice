package Stringmethods;

public class SwapFirstandLastChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="first tester program";
		    str=str+" ";
		String w="";
		String ns="";
		for(int i=0;i<str.length();i++)
		{
			char s=str.charAt(i);
			if(s!=' ')
			{
				w=w+s;
			}
			else
			{
				char f=w.charAt(0);
				char l=w.charAt(w.length()-1);
				String m=w.substring(1,w.length()-1);
				ns=ns+l+m+f+" ";
				w="";
			}
			
		}
		System.out.println(ns);
	} 

}

