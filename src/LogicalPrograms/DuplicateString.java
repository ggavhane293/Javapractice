package LogicalPrograms;

import java.util.HashSet;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[]= {"java","c","cpp","java"};
		
		HashSet<String> list = new HashSet();
		for(String ls:a) 
		{
			if(list.add(ls)==false)
			{
				System.out.println("duplicate is found");
			}
		}

	}

}
