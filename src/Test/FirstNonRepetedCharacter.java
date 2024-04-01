package Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepetedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getfirstchar("testdd"));
	}
	
	public static char getfirstchar(String str)
	{
		Map <Character,Integer> map= new LinkedHashMap<Character,Integer>(str.length());
		for(char ch:str.toCharArray())
		{
			if(map.containsKey(ch))
			{
			map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		for(Entry<Character, Integer> entry: map.entrySet())
		{
			if(entry.getValue()==1)
				return entry.getKey();
		}
			
		}
		//System.out.println(map);
		return 0;
		
	}

}
