package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Addingvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm =new HashMap<Integer,String>();
		
		//adding the keypair value in hashmap
		hm.put(100, "Hundred");
		hm.put(200, "two hundred");
		hm.put(300, "three hundred");
		
		//System.out.println(hm);//for printing in one line
		
		for(Map.Entry m :hm.entrySet())//for each loop for printing in separate line
		{
			//System.out.println(m);//printing in join key pair value
			
			System.out.println(m.getKey()+"  "+m.getValue());//printing the key value in separetely
			
		}
		
		
		
	}

}
