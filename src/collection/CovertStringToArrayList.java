package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CovertStringToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="my test java program";
		String str1[]=str.split("[ ]");
		List<String> al = new ArrayList(Arrays.asList(str1));
		boolean an= al.contains("my");//checking element available or not
		al.add("run");//adding element at the end
		al.set(0,"MY");//updating the element
		String as=al.get(2);//printing second element
		int sh=al.size();//checking size of list
		
		System.out.println(an);
		System.out.println(al);
		System.out.println(as);
		System.out.println(sh);

	}

}
