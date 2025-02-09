package frequentelyAskedQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckTheOccuranceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "my test programming";
		Map<Character,Integer>hm= new HashMap<Character,Integer>();
		for(Character ch:str.toCharArray())
		{
			if(hm.containsKey(ch) )
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}		
		}		
		System.out.println(hm);
	}
	}

