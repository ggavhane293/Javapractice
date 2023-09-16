package Array;

import java.util.ArrayList;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {2,34,5};
		int max=num[0];
		
		for(int i=1; i<num.length;i++)
		{
			if(num[i]>max)
			{
				max=num[i];
			}
			System.out.println(max);
		}

}
}


