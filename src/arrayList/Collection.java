package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(8);
		list.add(4);
		list.add(9);
		
		Collections.sort(list);//Accending order
		//Collections.sort(list,Collections.reverseOrder());//decending order
		//Collections.reverse(list);// reverse the list
		
		
		System.out.println(list);
		

	}

}
