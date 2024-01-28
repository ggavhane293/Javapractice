package Stringmethods;

public class PrintFirstCharaterinWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String w="";
		String s="test new my";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			{
				w+=c;
			}
			else
			{
				System.out.println(w.substring(0,2));
				w="";
			}
		}
		

	}

}
 