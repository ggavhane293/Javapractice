package javaChallangesQ;

import java.util.ArrayList;

public class RemoveRangeFromArray extends ArrayList{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//remove element from 30 and 40
		RemoveRangeFromArray test = new RemoveRangeFromArray();
		for(int i=1;i<=10;i++)
		{
			test.add(i*10);
		}
		System.out.println("before remove"+test);
		
		test.removeRange(2, 4);
		System.out.println("after remove"+test);
	}

}
//before remove[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
//after remove[10, 20, 50, 60, 70, 80, 90, 100]
