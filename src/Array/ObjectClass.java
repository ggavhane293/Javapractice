package Array;

public class ObjectClass {

	public static void main(String args[])
	{
		Object a []=new Object[5];
		a[0]=14;
		a[1]=35.0;
		a[2]="gan";
		a[3]='G';
		a[4]=true;
		
		for (Object i :a)
		{
			System.out.println(i);
		}
		
	}
}
