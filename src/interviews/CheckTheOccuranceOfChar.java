package interviews;

import java.util.HashMap;
import java.util.Map;

public class CheckTheOccuranceOfChar {
	
	public static void getCharCount(String name)
	{
		Map <Character, Integer> charmap= new HashMap<Character, Integer>();
		char arr[]=name.toCharArray();
		for(char c: arr)
		{
			if(charmap.containsKey(c))
			{
				charmap.put(c, charmap.get(c)+1);
			}
			else
			{
				charmap.put(c, 1);
			}
		}
		System.out.println(name+" "+charmap);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getCharCount("geeksofgeek");
		

	}

}
