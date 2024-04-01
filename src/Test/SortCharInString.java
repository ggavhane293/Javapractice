package Test;

import java.util.Arrays;

public class SortCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="java";
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
		String sortedstr= new String(ch);
		System.out.println(sortedstr);
	}

}
