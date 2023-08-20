package Test;

import java.util.ListIterator;
import java.util.Vector;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vector<Integer> k = new Vector<Integer>();
		k.add(123);
		k.add(45);
	
		ListIterator l1 = k.listIterator();
		while(l1.hasNext())
		{
			System.out.print(l1.next());
			System.out.print("\n");
			
		}
		while(l1.hasPrevious())
			System.out.print(l1.previous()+" ");
	}

}
