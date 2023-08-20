package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(50);
		list.add(34);
		list.add(55);
		list.add(300);
		list.add(23);
		System.out.println("original array"+list);
		
		Collections.sort(list);//printing the accending the order
		System.out.println("Accednign order array"+list);
		
		int element = list.get(list.size()-2);//for printing the second highest number
		System.out.println(element);
		
		
		Collections.sort(list, Collections.reverseOrder());//printing the decending order
		System.out.println("Decending Order array"+ list);
		
		int element1 = list.get(0);
		System.out.println(element1);
		
		
	}

}
