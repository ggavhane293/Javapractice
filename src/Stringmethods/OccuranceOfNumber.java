package Stringmethods;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3,5,4,3,4,4,1};
		
		Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		for(int i:a)
		{
			Integer val=map.get(i);
			if(val==null)
			{
				map.put(i, 1);
			}
			else
			{
				map.put(i, val+1);
			}
		}
		System.out.println(map);
		

	}

}
