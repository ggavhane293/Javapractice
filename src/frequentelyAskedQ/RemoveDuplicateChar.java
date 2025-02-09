package frequentelyAskedQ;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "programming";
		StringBuilder sb = new StringBuilder();
		Set<Character> st=new LinkedHashSet();
		
		for(Character ch:str.toCharArray())//reading the every character
		{
			st.add(ch);//adding unique character in set
		}
	
		for(Character s:st)//reading the set char 
		{
			sb.append(s);//adding the char into stringBuilder
		}
		System.out.println(sb);// printing the StringBuider
	}

}
