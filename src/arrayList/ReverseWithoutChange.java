package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWithoutChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="mu test prog";
		
		String []arr=str.split(" ");
		
		List<String> list = new ArrayList(Arrays.asList(arr));
		
		Collections.reverse(list);
		
		System.out.println(list);
	}

}
