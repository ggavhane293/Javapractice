package Stringmethods;

public class Swapthefirstandlastchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="tes the my ";
		String w="";
		String ns="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			{
				w=w+c;
			}
			else
			{
				char f=w.charAt(0);
				char g =w.charAt(w.length()-1);
				String m = w.substring(1, w.length()-1);
				ns=g+m+f+" ";
				w="";
			}
		}
		System.out.println(ns);

	}

}
