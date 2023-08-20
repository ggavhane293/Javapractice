package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		list.add("ab");
		list.add("c");
		list.add("f");
		
		System.out.println("before reverse"+list);
		Collections.reverse(list);
		System.out.println("after reverse"+list);
		
		

	}

}
