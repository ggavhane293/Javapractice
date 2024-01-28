package interviews;

import java.util.Arrays;
import java.util.Collections;

public class Coforge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find the occureance of character
		String str ="welcome to coforge";
		
		char c = 'o';
		System.out.println(Collections.frequency(Arrays.asList(str.split("")), String.valueOf(c)));

	}

}
