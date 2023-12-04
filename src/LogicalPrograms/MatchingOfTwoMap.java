package LogicalPrograms;

import java.util.HashMap;
import java.util.Map;

public class MatchingOfTwoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> map1= new  HashMap();
		
		map1.put(2, 4);
		map1.put(24, 45);
		map1.put(22, 45);
		map1.put(25, 45);
    
		HashMap<Integer,Integer> map2= new  HashMap();
		
		map1.put(2, 4);
		map1.put(24, 45);
		map1.put(22, 45);
		map1.put(25, 45);
		
		for(Map.Entry m:map1.entrySet())
		{
			for(Map.Entry v:map2.entrySet())
			{
				if(map1==map2)
				{
					System.out.println(v.getKey()+"  "+v.getValue());
				}
				else
				{
					System.out.println("not matching");
				}
			}
		}
	}

}
