package Test;

import java.util.Arrays;
import java.util.Collections;

public class Run2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hffddfhhdf";
		char c='h';
		System.out.println(Collections.frequency(Arrays.asList(str.split("")), String.valueOf(c)));
		
				
	}

}
