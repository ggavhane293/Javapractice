package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SecondHighestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(23);
		list.add(45);
		list.add(455);
		list.add(345);
		list.add(4);
		
		Collections.sort(list,Collections.reverseOrder());//Decending the order
		int element = list.get(1);//printing the second index value from array
		System.out.println(element);//printing the number
		
		
	}

}
