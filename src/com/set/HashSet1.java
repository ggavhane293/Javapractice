package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<String>();
		set.add("abc");
		set.add("xyz");
		set.add("g");
		//with foreach
		for(String s:set)
		{
			System.out.println(s);
		}
		
		//with iterator
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
