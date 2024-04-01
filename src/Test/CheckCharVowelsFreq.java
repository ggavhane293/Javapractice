package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CheckCharVowelsFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Gaensh gav first";
		CheckCharVowelsFreq chk = new CheckCharVowelsFreq();
		chk.getovelscount(str);
		chk.frequency(str);
	}

	private void getovelscount(String str) {
		// TODO Auto-generated method stub
		int wordcount=0;
		int vowelcont=0;
		int uppercasecount=0;
	
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			switch(c)
			{
			case ' ':
			case '.':
			wordcount++;		
			}
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowelcont++;
			}
			if(c>=65&&c<=90)
			{
				uppercasecount++;
			}
			
		}
		System.out.println("Total no words are: "+wordcount);
		System.out.println("Total vowels are: "+vowelcont);
		System.out.println("uppercase letter are: "+uppercasecount);
		
	}

	private void frequency(String str) {
		// TODO Auto-generated method stub
		Map<Character, Integer>map=new HashMap<Character,Integer>();
		
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
		
	}

}
