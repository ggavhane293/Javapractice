package Array;

public class ArraywithForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{10,34,57},{23,45,45},{23,456,44},{34,1,45}};
		
		for(int i[]:a)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
