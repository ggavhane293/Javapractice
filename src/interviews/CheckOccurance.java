package interviews;

import java.util.HashMap;

public class CheckOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="teseet";
		HashMap<Character,Integer> map=new HashMap<>();
		char arr[]=str.toCharArray();
		for(char s:arr)
		{
			if(map.containsKey(s))
			{
				map.put(s, map.get(s)+1);
			}
			else
			{
				map.put(s, 1);
			}
		}
		
		System.out.println(str+""+map);
	}
	
}
