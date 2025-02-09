package interviews;

import java.util.LinkedHashSet;

public class LTI_RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Remove duplicate char using the linkedhashset
		
		String str= "im good boy";
		String ans=" ";
		LinkedHashSet<Character> set= new LinkedHashSet();
		for(char s :str.toCharArray())
		{
			set.add(s);
		}
		StringBuilder sb = new StringBuilder();
		for(char c:set)
		{
			sb.append(c);
		}
		System.out.println(sb);
	}

}
