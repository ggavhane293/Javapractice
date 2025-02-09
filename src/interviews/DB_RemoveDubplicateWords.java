package interviews;

import java.util.HashSet;

public class DB_RemoveDubplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "give me the book of the of";
		String arr[]=s.split(" ");
		HashSet<String>hs = new HashSet();
		HashSet<String>hs1 = new HashSet();
		for(String st:arr)
		{
			if(!hs.add(st))
			{
			hs1.add(st);
			}
	}
		System.out.println(hs1);
	}
}
