package chatGPT;

import java.util.HashMap;

public class CharacterFrequency {
	
	public static String m1(String str)
	{
		HashMap<Character,Integer>map=new HashMap<>();
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
		}
		System.out.println(map);
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="programming in java";
		m1(str);
	}

}
