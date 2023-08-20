package arrayList;

import java.util.ArrayList;

public class RemoveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Best");
		list.add("java");
		list.add("class");
		
		System.out.println("Beofore remove"+list);
		
		list.remove(1);//removed java word from index 1
		
		System.out.println("after remove"+list);

	}

}
