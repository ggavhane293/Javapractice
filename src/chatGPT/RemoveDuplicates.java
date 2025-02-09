package chatGPT;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
	
	public static String m1(String str)
	{
		LinkedHashSet<Character>lh= new LinkedHashSet<>();
		for(char c:str.toCharArray())
		{
			lh.add(c);
		}
		StringBuilder sb= new StringBuilder();
		for(char c:lh)
		{
			sb.append(c);
		}
		System.out.println(sb);
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="programming";
		m1(str);
	}

}
