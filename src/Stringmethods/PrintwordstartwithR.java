package Stringmethods;

public class PrintwordstartwithR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String w=""; 
		String s="test rnew rmy rt thg";
		s+=" ";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			{
				w+=c;
			}
			else
			{
				//if(w.startsWith("r"))
				if(w.length()==3)
				//if(w.endsWith("st"));
				//if(w.contains("e"));
				System.out.println(w);
				w="";
			}
		}
		

	

	}

}
