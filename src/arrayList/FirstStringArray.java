package arrayList;

import java.util.ArrayList;

public class FirstStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> list = new ArrayList<String>();//declaration of arraylist
		list.add("first");//adding element to array
		list.add("second");
		list.add("third");
		list.add("four");
		list.add(2, "newsecond");
		
		System.out.println(list);

		
		for(String s :list)//reading element from the arraylist
		{
			
			System.out.println(s);
		}
		

	}

}
