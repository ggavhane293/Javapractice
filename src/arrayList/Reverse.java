package arrayList;

import java.util.Collections;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
		String b = "";

		for (int i = 0; i < a.length(); i++) {
		  b = a.charAt(i) + b;
		}

		System.out.println("Reversed string: "+ b);
		}

	}


